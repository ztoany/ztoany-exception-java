package io.github.ztoany.infra.exception;

public class BaseException extends RuntimeException {
    private String errorCode;
    private String errorMessage;

    public BaseException(String errorCode, String errorMessage) {
        super(buildMessage(errorCode, errorMessage));
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseException(String errorCode, String errorMessage, Throwable cause) {
        super(buildMessage(errorCode, errorMessage), cause);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseException(ErrorMessage errorMessage) {
        this(errorMessage.getCode(), errorMessage.getMessage());
        this.errorCode = errorMessage.getCode();
        this.errorMessage = errorMessage.getMessage();
    }

    public BaseException(ErrorMessage errorMessage, Throwable cause) {
        this(errorMessage.getCode(), errorMessage.getMessage(), cause);
        this.errorCode = errorMessage.getCode();
        this.errorMessage = errorMessage.getMessage();
    }

    private static String buildMessage(String errorCode, String errorMessage) {
        return String.format("%s - %s", errorCode, errorMessage);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
