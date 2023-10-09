package io.github.ztoany.infra.exception;

public class FormatMessageBusinessException extends BusinessException {
    public FormatMessageBusinessException(ErrorMessage errorMessage, Object... args) {
        super(errorMessage.getCode(), String.format(errorMessage.getMessage(), args));
    }
}
