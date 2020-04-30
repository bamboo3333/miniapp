package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.Userinfo;
import com.mini.miniapp.service.UserService;
import com.mini.miniapp.utils.MINIJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/4/29 11:56
 * 文件信息：
 */
@Controller
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/user/all.action")
    public ModelAndView queryAllUser(){
        //查找所有用户
        List<Userinfo> users = userService.selectAllUsers();
        //查找用户总数
        Integer userNum = userService.countUserNum();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users",users);
        modelAndView.addObject("userNum",userNum);
        modelAndView.setViewName("/user/userList");
        return modelAndView;
    }
}
