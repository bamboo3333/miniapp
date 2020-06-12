package com.mini.miniapp.service;

import com.mini.miniapp.pojo.Userinfo;

import java.util.List;

/**
 * @author:guan
 * @2020/4/29 11:50
 * 文件信息：
 */
public interface UserService {
    List<Userinfo> selectAllUsers();
    Integer countUserNum();
    void insertUser(Userinfo userinfo);
    Integer queryUserById(String id);
}
