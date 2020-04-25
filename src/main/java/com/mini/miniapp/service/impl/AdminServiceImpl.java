package com.mini.miniapp.service.impl;

import com.mini.miniapp.mapper.AdminMapper;
import com.mini.miniapp.pojo.Administrator;
import com.mini.miniapp.service.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:guan
 * @2020/4/1 20:50
 * 文件信息：
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Resource
    private AdminMapper adminMapper;
    @Override
    public Administrator login(Administrator admin) {
        Administrator administrator = adminMapper.login(admin);
        return administrator;
    }
}
