package com.mini.miniapp.service.impl;

import com.mini.miniapp.mapper.WrittentrainMapper;
import com.mini.miniapp.pojo.Writtentrain;
import com.mini.miniapp.service.WrittentrainService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/6/11 18:34
 * 文件信息：
 */
@Service
public class WrittentrainServiceImpl implements WrittentrainService {
    @Resource
    private WrittentrainMapper writtentrainMapper;
    @Override
    public List<Writtentrain> queryAll() {
        return writtentrainMapper.queryAll();
    }

    @Override
    public Writtentrain queryTrainById(Integer id) {
        return writtentrainMapper.queryTrainById(id);
    }

    @Override
    public void modifyTrainById(Writtentrain train) {
        writtentrainMapper.modifyTrainById(train);
    }

    @Override
    public void deleteTrainById(Integer id) {
        writtentrainMapper.deleteTrainById(id);
    }

    @Override
    public void saveTrain(Writtentrain writtentrain) {
        writtentrainMapper.saveTrain(writtentrain);
    }

    @Override
    public int countTrainNum() {
        return writtentrainMapper.countTrainNum();
    }

}
