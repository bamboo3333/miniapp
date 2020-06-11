package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.Writtentrain;
import com.mini.miniapp.service.WrittentrainService;
import com.mini.miniapp.utils.MINIJSONResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/6/11 18:32
 * 文件信息：
 */
@RestController
public class WrittentrainMiniController {
    @Resource
    private WrittentrainService writtentrainService;

    @RequestMapping("/train/all")
    public MINIJSONResult queryAllTrain() {
        List<Writtentrain> writtentrains = writtentrainService.queryAll();
        if (null != writtentrains) {
            MINIJSONResult ok = MINIJSONResult.ok(writtentrains);
            return ok;
        } else {
            MINIJSONResult error = MINIJSONResult.errorMsg("暂无任何训练题模板");
            return error;
        }
    }
}
