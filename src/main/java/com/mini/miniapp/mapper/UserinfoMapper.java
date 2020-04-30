package com.mini.miniapp.mapper;

import com.mini.miniapp.pojo.Userinfo;
import com.mini.miniapp.utils.MyMapper;

import java.util.List;

public interface UserinfoMapper extends MyMapper<Userinfo> {
    List<Userinfo> queryAllUser();
    Integer countUserNum();
}