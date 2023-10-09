package io.github.ztoany.infra.exception;


public enum SystemErrorMessages implements ErrorMessage {
    INTERNAL_ERROR("E1000001", "Internal Server Error"),
    ;

    private String code;
    private String message;

    SystemErrorMessages(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
