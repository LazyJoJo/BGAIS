package com.bgais.common.exception;

import com.bgais.common.api.IErrCode;

/**
 * 断言处理类，用于抛出各种API异常
 * Created by macro on 2020/2/27.
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrCode errCode) {
        throw new ApiException(errCode);
    }
}
