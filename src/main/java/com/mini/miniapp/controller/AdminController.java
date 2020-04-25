package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.Administrator;
import com.mini.miniapp.service.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author:guan
 * @2020/4/1 20:56
 * 文件信息：
 */
@Controller
public class AdminController{
    @Resource
    private AdminService adminService;
/*  获取登录数据的第一种方式，参数名，变量要与jsp中name属性名一致
 @RequestMapping(value = "/admin/login.action",method = RequestMethod.POST)
    public String login(String username,String password){
        System.out.println(username);
        System.out.println(password);
        return "login";
    }*/
    @RequestMapping(value = "/admin/login.action")
    /*
    获取方式2，定义对象，jsp中的属性和对象属性名一致
     */
    public String login(Administrator admin,HttpServletRequest httpServletRequest){
        //查询数据库
        Administrator administrator = adminService.login(admin);
        if (null!=administrator){
            //返回值不为空，跳转到success界面
            httpServletRequest.getSession().setAttribute("usersession",administrator.getAdminName());
            return "menu";
        }else {
            //登陆失败，重新登陆
            return "login";
        }
    }
    @RequestMapping(value = "/admin/logout.action")
    /*
    获取方式2，定义对象，jsp中的属性和对象属性名一致
     */
    public String logout(HttpServletRequest httpServletRequest){
        httpServletRequest.getSession().setAttribute("usersession",null);
        return "menu";
    }
}
