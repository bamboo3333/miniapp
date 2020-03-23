package com.mini.miniapp.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @Title: NEXTJSONResult.java
 * @Package
 * @Description: 自定义响应数据结构
 * 				这个类是提供给 H5/ios/安卓/公众号/小程序 使用的
 * 				门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 * 				其他自行处理
 * 				200：表示成功
 * 				500：表示错误，错误信息在msg字段中
 * 				501：bean验证错误，不管多少个错误都以map形式返回
 * 				502：拦截器拦截到用户token出错
 * 				555：异常抛出信息

 */
public class MINIJSONResult {

    // 定义jackson对象
    private static final ObjectMapper MAPPER = new ObjectMapper();

    // 响应业务状态
    private Integer status;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;
    
    @JsonIgnore
    private String ok;	// 不使用

    public static MINIJSONResult build(Integer status, String msg, Object data) {
        return new MINIJSONResult(status, msg, data);
    }

    public static MINIJSONResult ok(Object data) {
        return new MINIJSONResult(data);
    }

    public static MINIJSONResult ok() {
        return new MINIJSONResult(null);
    }
    
    public static MINIJSONResult errorMsg(String msg) {
        return new MINIJSONResult(500, msg, null);
    }
    
    public static MINIJSONResult errorMap(Object data) {
        return new MINIJSONResult(501, "error", data);
    }
    
    public static MINIJSONResult errorTokenMsg(String msg) {
        return new MINIJSONResult(502, msg, null);
    }
    
    public static MINIJSONResult errorException(String msg) {
        return new MINIJSONResult(555, msg, null);
    }

    public MINIJSONResult() {

    }

    public MINIJSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public MINIJSONResult(Object data) {
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOK() {
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}

}
