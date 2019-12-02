package cym.demo.ssmdemo.controller;

import org.apache.commons.fileupload.FileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Administrator on 2019/11/29.
 */
@Controller
@RequestMapping(value = "/file")
public class FileController {

    public static final String EXCEL_DIR = System.getProperty("catalina.base").replace("file:\\", "") + File.separatorChar + "temp" + File.separatorChar + "upload" + File.separatorChar;

    @RequestMapping(value = "")
    public String filetest() {
        return "filetest";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public Object upload(@RequestParam("file") CommonsMultipartFile file) {
        File filePath = new File(EXCEL_DIR+UUID()+file.getOriginalFilename());
        try {
            filePath.getParentFile().mkdirs();
            file.transferTo(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "upload success";
    }

    public String UUID() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
