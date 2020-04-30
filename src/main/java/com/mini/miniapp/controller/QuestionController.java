package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.Question;
import com.mini.miniapp.service.QuesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/4/30 20:15
 * 文件信息：
 */
@Controller
public class QuestionController {
    @Resource
    private QuesService quesService;
    @RequestMapping("/quesLog/all.action")
    public ModelAndView queryAll(){
        List<Question> questions = quesService.queryAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("questions",questions);
        modelAndView.setViewName("/trainLog/question");
        return modelAndView;
    }

}
