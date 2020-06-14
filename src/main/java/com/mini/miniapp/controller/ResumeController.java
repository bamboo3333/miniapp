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
    public ModelAndView queryAllResume(){
        List<Resumemodel> resumemodels = resumeService.queryAll();
        int resumeNum = resumeService.countNum();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("resumeList",resumemodels);
        modelAndView.addObject("resumeNum",resumeNum);
        modelAndView.setViewName("/resume/resumeList");
        return modelAndView;
    }

    @RequestMapping("/resume/resumeModifyView.action")
    public ModelAndView modifyResume(Integer id){
        Resumemodel resumemodel = resumeService.queryResumeById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("resumeModify",resumemodel);
        modelAndView.setViewName("resume/resumeModify");
        return modelAndView;
    }

    @RequestMapping("/resume/resumeModify.action")
    public String modifyResumeById(Resumemodel resumemodel){
        resumeService.modifyNewsById(resumemodel);
        return "redirect:/resume/all.action";
    }
    @RequestMapping("/resume/resumeDelete.action")
    public String deleteResumesById(Integer id ){
        resumeService.deleteResumeById(id);
        return "redirect:/resume/all.action";
    }
    @RequestMapping("/resume/resumesave.action")
    public String save(Resumemodel resumemodel){
        resumeService.resumeSave(resumemodel);
        return "redirect:/resume/all.action";
    }



}
