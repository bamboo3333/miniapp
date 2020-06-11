package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.Resumemodel;
import com.mini.miniapp.service.ResumeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/4/29 15:35
 * 文件信息：
 */
@Controller
public class ResumeController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/resume/all.action")
    public ModelAndView queryAllResume(Integer id){
        List<Resumemodel> resumemodels = resumeService.queryAllResume(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("resumeList",resumemodels);
        modelAndView.setViewName("/resume/resumeList");
        return modelAndView;
    }


}
