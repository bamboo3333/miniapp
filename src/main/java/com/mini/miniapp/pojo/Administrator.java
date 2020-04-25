package com.mini.miniapp.pojo;

/**
 * @author:guan
 * @2020/4/1 20:48
 * 文件信息：
 */
public class Administrator {

    private String id;
    private String adminName;
    private String adminPassword;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }
}
