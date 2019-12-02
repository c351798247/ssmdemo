package cym.demo.ssmdemo.controller;

import org.apache.commons.fileupload.FileItem;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * Created by Administrator on 2019/11/29.
 */
@Controller
@RequestMapping(value = "/file")
public class FileController {

    public static final String BASE_DIR = System.getProperty("catalina.base").replace("file:\\", "") + File.separatorChar + "temp" + File.separatorChar + "upload" + File.separatorChar;

    @RequestMapping(value = "")
    public String filetest(Model model) {
        File downloadDir = new File(BASE_DIR);
        File[] files = downloadDir.listFiles();
        model.addAttribute("files", files);
        return "filetest";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public Object upload(@RequestParam("file") CommonsMultipartFile file) {
        File filePath = new File(BASE_DIR+UUID()+file.getOriginalFilename());
        try {
            filePath.getParentFile().mkdirs();
            file.transferTo(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return "upload error";
        }
        return "upload success";
    }

    @RequestMapping(value = "/download/{fileName}", method = RequestMethod.GET)
    public ResponseEntity<byte[]> download(HttpServletRequest request, @PathVariable String fileName) throws IOException {
        File target = null;
        File downloadDir = new File(BASE_DIR);
        File[] files = downloadDir.listFiles();
        for (File file : files) {
            if (file.getName().contains(fileName)) {
                target = file;
            }
        }
        byte[] body = null;
        InputStream is = new FileInputStream(target);
        body = new byte[is.available()];
        is.read(body);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attchement;filename=" + target.getName());
        HttpStatus statusCode = HttpStatus.OK;
        ResponseEntity<byte[]> entity = new ResponseEntity<>(body, headers, statusCode);
        return entity;
    }

    public String UUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
