package com.mcipay.controller;

import com.merchant.exception.BusinessException;
import com.merchant.util.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;


@ControllerAdvice
public class GlobalExceptionHandler {

    protected Logger LOGGER = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(value = {BusinessException.class})
    @ResponseBody
    public BaseResponse exceptionHandler(BusinessException e, HttpServletResponse response) {
        LOGGER.error("exceptionHandler.BusinessException", e);
        return BaseResponse.failed(e.getMessage());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public BaseResponse exceptionHandler(Exception e, HttpServletResponse response) {
        LOGGER.error("exceptionHandler.Exception", e);
        return BaseResponse.failed("服务器异常，请联系管理员");
    }


}
