package com.merchant.controller;

import com.merchant.util.BaseResponse;
import com.merchant.util.ValidatorResult;
import com.merchant.util.ValidatorUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ValidateAopService {

    @Pointcut("@annotation(com.merchant.util.ValidateAop)")
    public void validateAop() {
    }

    @Around("validateAop()")
    public Object validate(ProceedingJoinPoint joinPoint) {
        BaseResponse response = new BaseResponse();
        Object[] args = joinPoint.getArgs();
        for (Object param: args) {
            ValidatorResult result = ValidatorUtil.validate(param);
            if(!result.isAvailable()) {
                response.error();
                response.setMessage(result.getMessage());
                return response;
            }
        }
        try {
            return joinPoint.proceed(args);
        } catch (Throwable throwable) {
            response.error();
            response.setMessage(throwable.getMessage());
            return response;
        }
    }

}
