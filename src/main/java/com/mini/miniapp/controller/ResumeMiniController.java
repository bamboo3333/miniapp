package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.News;
import com.mini.miniapp.pojo.Resumemodel;
import com.mini.miniapp.service.ResumeService;
import com.mini.miniapp.utils.MINIJSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/6/11 16:20
 * 文件信息：
 */
@RestController
public class ResumeMiniController {
    @Resource
    private ResumeService resumeService;
    @RequestMapping("/resume/all")
    public MINIJSONResult queryAllResume(Integer typeId){
        List<Resumemodel> resumemodels = resumeService.queryAllResume(typeId);
        if (null!=resumemodels){
            MINIJSONResult ok = MINIJSONResult.ok(resumemodels);
            return ok;
        }else {
            MINIJSONResult error = MINIJSONResult.errorMsg("暂无任何简历模板");
            return error;
        }
    }

}
