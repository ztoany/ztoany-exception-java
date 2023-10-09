package io.github.ztoany.infra.exception;

public class BusinessException extends BaseException {
    public BusinessException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public BusinessException(String errorCode, String errorMessage, Throwable cause) {
        super(errorCode, errorMessage, cause);
    }

    public BusinessException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public BusinessException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
