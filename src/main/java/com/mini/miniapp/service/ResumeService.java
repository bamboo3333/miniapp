package com.mini.miniapp.service;

import com.mini.miniapp.pojo.Resumemodel;

import java.util.List;

/**
 * @author:guan
 * @2020/4/29 15:38
 * 文件信息：
 */
public interface ResumeService {
    List<Resumemodel> queryAllResume(Integer typeId);
    List<Resumemodel> queryAll();

    Resumemodel queryResumeById(Integer id);

    void modifyNewsById(Resumemodel resumemodel);

    void deleteResumeById(Integer id);

    int countNum();

    void resumeSave(Resumemodel resumemodel);
}
