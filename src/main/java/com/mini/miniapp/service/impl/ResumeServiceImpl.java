package com.mini.miniapp.service.impl;

import com.mini.miniapp.mapper.ResumemodelMapper;
import com.mini.miniapp.pojo.Resumemodel;
import com.mini.miniapp.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/4/29 15:39
 * 文件信息：
 */
@Service
public class ResumeServiceImpl implements ResumeService {
    @Resource
    private ResumemodelMapper resumemodelMapper;
    @Override
    public List<Resumemodel> queryAllResume(Integer typeId) {

        return resumemodelMapper.queryAllResume(typeId);
    }
}
