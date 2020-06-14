package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.Resumemodel;
import com.mini.miniapp.utils.MyMapper;

import java.util.List;

public interface ResumemodelMapper extends MyMapper<Resumemodel> {
    List<Resumemodel> queryAllResume(Integer typeId);

    List<Resumemodel> queryAll();

    Resumemodel queryResumeById(Integer id);

    void modifyNewsById(Resumemodel resumemodel);

    void deleteResumeById(Integer id);

    int countNum();
}