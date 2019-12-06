package cym.demo.ssmdemo.controller;

import cym.demo.ssmdemo.bean.TbUser;
import cym.demo.ssmdemo.bean.TbUserExample;
import cym.demo.ssmdemo.dao.TbUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2019/11/22.
 */
@Controller
//@RequestMapping("/ssm")
public class HelloController {

    @Autowired
    TbUserMapper userMapper;

    /**
     * 使用注解@RequestParam获取参数
     * @param input 接收请求参数
     * @return  页面名称
     */
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam("dd") String input) {
//        System.out.println(userMapper.countByExample(new TbUserExample()));
        System.out.println(input);
        return "second";
    }

    /**
     * 一般请求
     * @return 跳转three.html
     */
    @RequestMapping(value = "/thre")
    public String three() {
        return "three";
    }

    /**
     * 接收url请求的封装对象，如form表单，
     * @param tbUser 实体类
     * @return three.html
     */
    @RequestMapping(method = RequestMethod.POST, value = "/user")
    public String user(TbUser tbUser) {
//        System.out.println(uname);
//        System.out.println(upass);
//        System.out.println(userId);
        System.out.println(tbUser);
        return "three";
    }

    /**
     * RequestBody接收application/json请求内容的json串
     * @param tbUser 实体类
     * @return json对象
     */
    @RequestMapping(method = RequestMethod.POST, value = "/user2")
    @ResponseBody
    public Object user2(@RequestBody TbUser tbUser) {

        System.out.println(tbUser);
        return tbUser;
    }


    @RequestMapping(value = "/out/{id}")
    @ResponseBody
    public Object out(@PathVariable("id") Integer cc) {
        return cc;
    }
}
