package com.merchant.util;

public class BaseResponse {

    private ResponseCode code = ResponseCode.ERROR;
    private String message;
    private Object data;

    public BaseResponse() {
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

    @Override
    public String toString() {
        return JsonUtil.toJson(this);
    }
}
