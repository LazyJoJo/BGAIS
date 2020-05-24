package com.bgais.common.exception;


import com.bgais.common.api.IErrCode;

/**
 * 自定义API异常
 * Created by macro on 2020/2/27.
 */
public class ApiException extends RuntimeException {
    private IErrCode errCode;

    public ApiException(IErrCode errCode) {
        super(errCode.getMessage());
        this.errCode = errCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrCode getErrorCode() {
        return errCode;
    }
}
