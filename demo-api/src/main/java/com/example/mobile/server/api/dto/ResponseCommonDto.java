package com.example.mobile.server.api.dto;

import java.io.Serializable;

/**
 * dubbo响应参数
 *
 * @since 2018/10/01
 */
public class ResponseCommonDto<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 错误信息
     */
    private String msg;

    private T data;

    public ResponseCommonDto(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseCommonDto(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
        this.data = null;
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseCommonDto{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
