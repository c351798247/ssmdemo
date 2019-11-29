package cym.demo.ssmdemo.controller;

import org.apache.commons.fileupload.FileItem;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * Created by Administrator on 2019/11/29.
 */
@Controller
@RequestMapping(value = "/file")
public class FileController {

    @RequestMapping(value = "")
    public String filetest() {
        return "filetest";
    }

    public Object upload(@RequestParam("file") CommonsMultipartFile file) {

        return "upload success";
    }
}
