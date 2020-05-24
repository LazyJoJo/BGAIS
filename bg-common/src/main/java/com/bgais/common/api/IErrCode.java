package com.bgais.common.api;

/**
 * 封装API的错误码
 * Created by macro on 2019/4/19.
 */
public interface IErrCode {
    long getCode();

    String getMessage();
}
