package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.CompanyStatistics;
import com.mini.miniapp.pojo.JobStatistics;
import com.mini.miniapp.service.NewsService;
import com.mini.miniapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/6/7 22:01
 * 文件信息：
 */
@Controller
public class DataController {
    @Resource
    private NewsService newsService;
    @Resource
    private UserService userService;

    @RequestMapping("/data.action")
    public ModelAndView getData(){
        //获取工作信息统计
        List<JobStatistics> jobType = newsService.countJobType();
        //获取招聘公司信息
        List<CompanyStatistics> companys = newsService.countCompany();
        ModelAndView modelAndView = new ModelAndView();
        //添加数据到模型中
        modelAndView.addObject("jobType",jobType);
        modelAndView.addObject("companys",companys);
        modelAndView.setViewName("dataDisplay");
        return modelAndView;
    }

}
