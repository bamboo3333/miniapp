package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.News;
import com.mini.miniapp.service.NewsService;
import com.mini.miniapp.utils.MINIJSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/3/23 16:13
 * 文件信息：
 */
//这个类的所有方法返回的都是json对象,相当于controller+ResponserBody
@RestController
public class HelloController {
    /*@RequestMapping("/hello")
    public String hello(){
        return "Hello";
    }*/
    @Resource
    private NewsService newsService;
    @RequestMapping("/news/one.action")
    public MINIJSONResult query(){
        News news = newsService.queryNewsById(1);
        MINIJSONResult ok = MINIJSONResult.ok(news);
        System.out.println(ok);
        return ok;
    }
}
