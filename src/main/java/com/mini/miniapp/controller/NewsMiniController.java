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
 * @2020/4/12 21:31
 * 文件信息：
 */
@RestController
public class NewsMiniController {
    @Resource
    private NewsService newsService;
    //招聘资讯页返回招聘信息信息
    @RequestMapping("/news/all")
    public MINIJSONResult queryNewsAll(){
        List<News> newsList = newsService.queryAllNews();
        if (null!=newsList){
            MINIJSONResult ok = MINIJSONResult.ok(newsList);
            return ok;
        }else {
            MINIJSONResult error = MINIJSONResult.errorMsg("暂无任何招聘信息");
            return error;
        }
    }
}
