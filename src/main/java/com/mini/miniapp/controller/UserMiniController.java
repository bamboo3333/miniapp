package com.mini.miniapp.controller;

import com.mini.miniapp.pojo.Userinfo;
import com.mini.miniapp.service.UserService;
import com.mini.miniapp.utils.MINIJSONResult;
import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author:guan
 * @2020/6/12 14:45
 * 文件信息：
 */
@RestController
public class UserMiniController {
    @Resource
    private UserService userService;

    @RequestMapping("/user/info")
    @ResponseBody
    public MINIJSONResult insertUSerInfo(HttpServletRequest request){
        String user = request.getParameter("user");
        Userinfo userinfo = (Userinfo)JSONObject.toBean(JSONObject.fromObject(user),Userinfo.class);
        String openid = userinfo.getOpenid();
        Integer id = userService.queryUserById(openid);
        if (id!=null){
//            待补充统计用户活跃量
        }else {
            userService.insertUser(userinfo);
        }
        return null;
    }
}
