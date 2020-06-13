package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.CompanyStatistics;
import com.mini.miniapp.pojo.JobStatistics;
import com.mini.miniapp.service.NewsService;
import com.mini.miniapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        //获取岗位信息
        List<String> positions = newsService.countPosition();
        //对岗位提取关键词
        List<String> goals = Arrays.asList("开发","前端","java","python","c++","后端","Android","ios","算法");
        Map<String,Integer> res = new HashMap();
        for (String p:positions) {
            for (String g:goals){
                if (p.contains(g)){
                    if(res.get(g)!=null){
                        int num = res.get(g);
                        ++num;
                        res.put(g,num);
                    }else {
                        res.put(g,1);
                    }

                }
            }

        }
        ModelAndView modelAndView = new ModelAndView();
        //添加数据到模型中
        modelAndView.addObject("jobType",jobType);
        modelAndView.addObject("companys",companys);
        modelAndView.addObject("positions",res);
        modelAndView.setViewName("dataDisplay");
        return modelAndView;
    }

}
