package com.mini.miniapp.service.impl;

import com.mini.miniapp.mapper.UserinfoMapper;
import com.mini.miniapp.pojo.Userinfo;
import com.mini.miniapp.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:guan
 * @2020/4/29 11:51
 * 文件信息：
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserinfoMapper userinfoMapper;
    @Override
    public List<Userinfo> selectAllUsers() {
        return userinfoMapper.queryAllUser();
    }

    @Override
    public Integer countUserNum() {
        return userinfoMapper.countUserNum();
    }

    @Override
    public void insertUser(Userinfo userinfo) {
        userinfoMapper.insertUser(userinfo);
    }

    @Override
    public Integer queryUserById(String id) {
        return userinfoMapper.queryUserById(id);
    }
}
