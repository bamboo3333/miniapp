package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.Writtentrain;
import com.mini.miniapp.utils.MyMapper;

import java.util.List;

public interface WrittentrainMapper{
    List<Writtentrain> queryAll();

    Writtentrain queryTrainById(Integer id);

    void modifyTrainById(Writtentrain train);

    void deleteTrainById(Integer id);

    void saveTrain(Writtentrain writtentrain);

    int countTrainNum();
}