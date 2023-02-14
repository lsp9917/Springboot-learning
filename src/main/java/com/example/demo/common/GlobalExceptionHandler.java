package com.example.demo.common;

/**
 * @author : [laishaopeng_zz]
 * @version : [v1.0]
 * @description : [一句话描述该类的功能]
 * @createTime : [2023/2/14 17:44]
 * @updateUser : [laishaopeng_zz]
 * @updateTime : [2023/2/14 17:44]
 * @updateRemark : [说明本次修改内容]
 */


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;

/**
 * 全局异常处理器
 *
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("businessException: " + e.getMessage(), e);
        return ResultUtils.error(e.getCode(), e.getMessage(), e.getDescription());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeExceptionHandler(RuntimeException e) {
        log.error("runtimeException", e);
        return ResponseHelper.fail(ErrorCode.SYSTEM_ERROR, e.getMessage(), "");
    }

    /**
     * 参数格式异常处理
     */
    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public BaseResponse badRequestException(IllegalArgumentException ex) {
        log.error("参数格式不合法：{}", ex.getMessage());
        return ResultUtils.error(HttpStatus.BAD_REQUEST, "参数格式不符！");
    }

    /**
     * 权限不足异常处理
     */
    @ExceptionHandler({AccessDeniedException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public BaseResponse badRequestException(AccessDeniedException ex) {
        return ResultUtils.error(HttpStatus.FORBIDDEN, ex.getMessage());
    }

    /**
     * 参数缺失异常处理
     */
    @ExceptionHandler({MissingServletRequestParameterException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseHelper badRequestException(Exception ex) {
        return ResponseHelper.fail(ex.getMessage(), "缺少必填参数！");
    }

    /**
     * 空指针异常
     */
    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseResponse handleTypeMismatchException(NullPointerException ex) {
        log.error("空指针异常，{}", ex.getMessage());
        return ResultUtils.error("空指针异常");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseResponse handleUnexpectedServer(Exception ex) {
        log.error("系统异常：", ex);
        return ResultUtils.error("系统发生异常，请联系管理员");
    }

    /**
     * 系统异常处理
     */
    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public BaseResponse exception(Throwable throwable) {
        log.error("系统异常", throwable);
        return ResultUtils.error(HttpStatus.INTERNAL_SERVER_ERROR, "系统异常，请联系管理员！");
    }
}

