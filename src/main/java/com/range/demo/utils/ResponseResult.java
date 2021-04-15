package com.range.demo.utils;
/*
由于封装的 JSON 数据的类型不确定，
所以在定义统一的 JSON 结构时，我们需要用到泛型。
统一的 JSON 结构中属性包括数据、状态码、提示信息即可，
构造方法可以根据实际业务需求做相应的添加。
一般来说，应该有默认的返回结构，也应该有用户指定的返回结构
 */

public class ResponseResult<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private int code;
    private String msg;

    public ResponseResult(int code) {
        this.code = code;
        this.msg = "操作成功！";
    }

    //默认情况
    public ResponseResult(T data, int code) {
        this.data = data;
        this.code = code;
        this.msg = "OK";
    }

    //有数据返回
    public ResponseResult(T data, String msg, int code) {
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

}
