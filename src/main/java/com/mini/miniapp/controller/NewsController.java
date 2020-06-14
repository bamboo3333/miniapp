package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.News;
import com.mini.miniapp.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/3/24 18:25
 * 文件信息：
 */
@Controller
public class NewsController {
    @Resource
    private NewsService newsService;
    //查询消息显示到后端管理界面
    @RequestMapping("/news/info.action")
    public ModelAndView queryNewsById(){
        List<News> newsList = newsService.queryAllNews();
        //MINIJSONResult ok = MINIJSONResult.ok(newsList);
        int newsNum = newsService.countNum();
        //使用ModelAndView设置
        ModelAndView modelAndView = new ModelAndView();
        //添加数据到模型中
        modelAndView.addObject("newsList",newsList);
        modelAndView.addObject("newsNum",newsNum);
        //添加跳转路径
        //显示jsp/demo2.jsp页面
        modelAndView.setViewName("news/newsList");

        return modelAndView;
    }
    //保存新增消息
    @RequestMapping("/news/save.action")
    public String saveNewsTypeId(News news){
        newsService.saveNewsByTypeId(news);
        return "redirect:/news/info.action";
    }

    //
    //查询消息显示到后端管理界面
    @RequestMapping("/news/newsDetails.action")
    public ModelAndView queryNewsById(Integer id){
        News news = newsService.queryNewsById(id);
        //MINIJSONResult ok = MINIJSONResult.ok(newsList);
        //使用ModelAndView设置
        ModelAndView modelAndView = new ModelAndView();
        //添加数据到模型中
        modelAndView.addObject("newsDetails",news);
        //添加跳转路径
        //显示jsp/demo2.jsp页面
        modelAndView.setViewName("news/newsDetails");

        return modelAndView;
    }
    //接收参数id,出巡数据库，返回索要修改的消息内容展示
    @RequestMapping(value = "/news/newsModifyView.action")
    public ModelAndView modifyNews(Integer id){
        News news = newsService.queryNewsById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("newsModify",news);
        modelAndView.setViewName("news/newsModify");
        return modelAndView;
    }
    //更新信息更改聂荣
    @RequestMapping("/news/newsModify.action")
    public String modifyNewsById(News news){
        newsService.modifyNewsById(news);
        return "redirect:/news/info.action";
    }
    //信息删除
    @RequestMapping("/news/newsDelete.action")
    public String deleteNewsById(Integer id){
        newsService.deleteNewsById(id);
        return "redirect:/news/info.action";
    }
}
