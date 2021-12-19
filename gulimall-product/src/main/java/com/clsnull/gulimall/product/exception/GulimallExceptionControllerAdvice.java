package com.clsnull.gulimall.product.exception;

import com.clsnull.common.exception.BizCodeEnum;
import com.clsnull.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice(basePackages = "com.clsnull.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {
        log.error("数据校验出现错误：{},异常类型：{}", e.getMessage(), e.getClass());
        Map<String, String> resultMap = new HashMap<>();
        e.getFieldErrors().forEach(item -> {
            String message = item.getDefaultMessage();
            String field = item.getField();
            resultMap.put(field,message);
        });

        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(),BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data", resultMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R HandleException(Throwable e){
        log.error("未知异常错误：{},异常类型：{}", e.getMessage(), e.getClass());
        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(),BizCodeEnum.UNKNOW_EXCEPTION.getMsg());

    }
}
