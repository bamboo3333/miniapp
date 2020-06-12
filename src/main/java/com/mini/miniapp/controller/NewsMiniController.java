package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.News;
import com.mini.miniapp.service.NewsService;
import com.mini.miniapp.utils.MINIJSONResult;
import org.apache.ibatis.annotations.Param;
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

    /**
     *
     * @param typeId：根据id查找实习类型:
     *          0:实习生
     *          1：全职生
     *          2：招聘生
     * @return
     */
    @RequestMapping("/news/jobInfo")
    public MINIJSONResult queryNewsByType(Integer typeId){
//        System.out.println(typeId);
        List<News> newsList = newsService.queryNewsByType(typeId);
        if (null!=newsList){
            MINIJSONResult ok = MINIJSONResult.ok(newsList);
            return ok;
        }else {
            MINIJSONResult error = MINIJSONResult.errorMsg("暂无任何招聘信息");
            return error;
        }
    }
    @RequestMapping("/news/today")
    public MINIJSONResult queryTodayNews(Integer type){
        List<News> newsList = newsService.queryTodayNews(type);
        if (null!=newsList){
            MINIJSONResult ok = MINIJSONResult.ok(newsList);
            return ok;
        }else {
            MINIJSONResult error = MINIJSONResult.errorMsg("暂无任何招聘信息");
            return error;
        }
    }
}
