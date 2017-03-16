package org.loyalty.crm.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.loyalty.crm.domain.response.Response;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartException;

/**
 * Created by yangzuojie on 2017/3/9.
 * @ ControllerAdvice是一个@ Component，
 用于定义@ ExceptionHandler的，@InitBinder和@ModelAttribute方法，适用于所有使用@ RequestMapping方法，并处理所有@ RequestMapping标注方法出现异常的统一处理。
 */
@ControllerAdvice
@ResponseBody
public class ExceptionAdvice {
    private static final Log logger =
            LogFactory.getLog(ExceptionAdvice.class);

    /**
     * 400 - Bad Request
     */
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public Response handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        logger.error("参数解析失败", e);
        return new Response().failure("could_not_read_json");
    }

    /**
     * 405 - Method Not Allowed
     */
    @ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Response handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        logger.error("不支持当前请求方法", e);
        return new Response().failure("request_method_not_supported");
    }

    /**
     * 415 - Unsupported Media Type
     */
    @ResponseStatus(HttpStatus.UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public Response handleHttpMediaTypeNotSupportedException(Exception e) {
        logger.error("不支持当前媒体类型", e);
        return new Response().failure("content_type_not_supported");
    }

    /**
     * 500 - Internal Server Error
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public Response handleException(Exception e) {
        logger.error("服务运行异常", e);
        return new Response().failure(e.getMessage());
    }

    /**
     * 操作数据库出现异常:名称重复，外键关联
     */
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(DataIntegrityViolationException.class)
    public Response handleException(DataIntegrityViolationException e) {
        logger.error("操作数据库出现异常:", e);
        return new Response().failure("操作数据库出现异常：字段重复、有外键关联等");
    }

    /**
     * 文件上传失败异常处理
     */
    @ExceptionHandler(MultipartException.class)
    public Response handleException(MultipartException e) {
        logger.error("文件上传服务出现异常:", e);
        return new Response().failure("文件上传服务出现异常:文件过大、传输过程出现异常等");
    }
}
