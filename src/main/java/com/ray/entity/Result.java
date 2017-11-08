package com.ray.entity;

import java.io.Serializable;

/**
 * 返回结果实体类
 * @author Ray Lin
 * @createTime 2017-11-08 22:54
 */
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    //返回码
    private Integer code;
    //返回消息
    private String msg;
    //返回数据
    private Object data;

    public Result() {
    }

    public Result(Integer code, String msg, String data) {
        {
            this.code = code;
            this.msg = msg;
            this.data = data;
        }
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
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

}
