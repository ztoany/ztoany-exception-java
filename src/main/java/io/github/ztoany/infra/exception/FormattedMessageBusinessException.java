package io.github.ztoany.infra.exception;

public class FormattedMessageBusinessException extends BusinessException {
    public FormattedMessageBusinessException(ErrorMessage errorMessage, Object... args) {
        super(errorMessage.getCode(), String.format(errorMessage.getMessage(), args));
    }
}
