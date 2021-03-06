package com.merchant.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class BaseResponse {

    private ResponseCode code = ResponseCode.ERROR;
    private String message;
    private Object data;

    public BaseResponse() {
    }

    public static BaseResponse success(String message) {
        return success(message, null);
    }

    public static BaseResponse success(Object data) {
        return success(null, data);
    }

    public static BaseResponse success(String message, Object data) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(ResponseCode.SUCCESS);
        baseResponse.setMessage(message);
        baseResponse.setData(data);
        return baseResponse;
    }

    public static BaseResponse failed(String message) {
        return failed(message, null);
    }

    public static BaseResponse failed(Object data) {
        return failed(null, data);
    }

    public static BaseResponse failed(String message, Object data) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(ResponseCode.ERROR);
        baseResponse.setMessage(message);
        baseResponse.setData(data);
        return baseResponse;
    }

    public BaseResponse(ResponseCode code) {
        this.code = code;
    }

    public ResponseCode getCode() {
        return code;
    }

    public void setCode(ResponseCode code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void success() {
        this.code = ResponseCode.SUCCESS;
    }

    public void error() {
        this.code = ResponseCode.ERROR;
    }

    public boolean isSuccess() {
        return ResponseCode.SUCCESS.equals(this.code);
    }

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }
}
