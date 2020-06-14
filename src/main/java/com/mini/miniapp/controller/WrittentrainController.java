package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.Writtentrain;
import com.mini.miniapp.service.WrittentrainService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/6/14 9:45
 * 文件信息：
 */
@Controller
public class WrittentrainController {
    @Resource
    private WrittentrainService writtentrainService;
    @RequestMapping("/train/info.action")
    public ModelAndView queryTrainById(){
        List<Writtentrain> trainsList = writtentrainService.queryAll();
        int trainNum = writtentrainService.countTrainNum();
        //MINIJSONResult ok = MINIJSONResult.ok(newsList);
        //使用ModelAndView设置
        ModelAndView modelAndView = new ModelAndView();
        //添加数据到模型中
        modelAndView.addObject("trainsList",trainsList);
        modelAndView.addObject("trainNum",trainNum);
        //添加跳转路径
        //显示jsp/demo2.jsp页面
        modelAndView.setViewName("train/trainList");

        return modelAndView;
    }
    @RequestMapping("/train/trainDetails.action")
    public ModelAndView queryTrainById(Integer id){
        Writtentrain writtentrain = writtentrainService.queryTrainById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("trainDetails",writtentrain);
        modelAndView.setViewName("train/trainDetails");

        return modelAndView;
    }
    @RequestMapping(value = "/train/trainModifyView.action")
    public ModelAndView modifyTrain(Integer id){
        Writtentrain writtentrain = writtentrainService.queryTrainById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("trainModify",writtentrain);
        modelAndView.setViewName("train/trainModify");
        return modelAndView;
    }

    @RequestMapping("/train/trainModify.action")
    public String modifyNewsById(Writtentrain train){
        writtentrainService.modifyTrainById(train);
        return "redirect:/train/info.action";
    }
    @RequestMapping("/train/trainDelete.action")
    public String deleteNewsById(Integer id){
        writtentrainService.deleteTrainById(id);
        return "redirect:/train/info.action";
    }


    @RequestMapping("/train/save.action")
    public String saveNewsTypeId(Writtentrain writtentrain){
        writtentrainService.saveTrain(writtentrain);
        return "redirect:/train/info.action";
    }

}
