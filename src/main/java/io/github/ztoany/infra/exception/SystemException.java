package io.github.ztoany.infra.exception;

public class SystemException extends BaseException {
    public SystemException(String errorCode, String errorMessage) {
        super(errorCode, errorMessage);
    }

    public SystemException(String errorCode, String errorMessage, Throwable cause) {
        super(errorCode, errorMessage, cause);
    }

    public SystemException(ErrorMessage errorMessage) {
        super(errorMessage);
    }

    public SystemException(ErrorMessage errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
