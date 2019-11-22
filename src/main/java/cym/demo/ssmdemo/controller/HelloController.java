package cym.demo.ssmdemo.controller;

import cym.demo.ssmdemo.bean.TbUserExample;
import cym.demo.ssmdemo.dao.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2019/11/22.
 */
@Controller
public class HelloController {

    @Autowired
    TbUserMapper userMapper;
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String input) {
        System.out.println(userMapper.countByExample(new TbUserExample()));
        System.out.println(input);
        return "second";
    }
}
