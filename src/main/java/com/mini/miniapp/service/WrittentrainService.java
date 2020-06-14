package com.mini.miniapp.service;

import com.mini.miniapp.pojo.Writtentrain;

import java.util.List;

/**
 * @author:guan
 * @2020/6/11 18:34
 * 文件信息：
 */
public interface WrittentrainService {
    List<Writtentrain> queryAll();

    Writtentrain queryTrainById(Integer id);

    void modifyTrainById(Writtentrain train);

    void deleteTrainById(Integer id);

    void saveTrain(Writtentrain writtentrain);

    int countTrainNum();
}
