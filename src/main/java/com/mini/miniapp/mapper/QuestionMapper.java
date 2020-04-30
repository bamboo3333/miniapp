package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.Question;
import com.mini.miniapp.utils.MyMapper;

import java.util.List;

public interface QuestionMapper {
    List<Question> queryAllQues();
}