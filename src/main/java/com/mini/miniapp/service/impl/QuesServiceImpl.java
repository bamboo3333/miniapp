package com.mini.miniapp.service.impl;

import com.mini.miniapp.mapper.QuestionMapper;
import com.mini.miniapp.pojo.Question;
import com.mini.miniapp.service.QuesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/4/30 20:22
 * 文件信息：
 */
@Service
public class QuesServiceImpl implements QuesService {
    @Resource
    private QuestionMapper questionMapper;
    @Override
    public List<Question> queryAll() {
        return questionMapper.queryAllQues();
    }
}
