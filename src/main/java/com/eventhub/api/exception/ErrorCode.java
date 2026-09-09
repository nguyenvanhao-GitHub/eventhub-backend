package com.eventhub.api.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Invalid message key", HttpStatus.BAD_REQUEST),
    USER_EXISTED(1002, "User already exists", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTED(1003, "User not found", HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1004, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1005, "You do not have permission", HttpStatus.FORBIDDEN),
    INVALID_CREDENTIALS(1006, "Invalid username or password", HttpStatus.UNAUTHORIZED),
    RESOURCE_NOT_FOUND(1007, "Resource not found", HttpStatus.NOT_FOUND),
    INVALID_REQUEST(1008, "Invalid request payload", HttpStatus.BAD_REQUEST),
    EMAIL_SEND_FAILED(1009, "Failed to send email", HttpStatus.INTERNAL_SERVER_ERROR),
    TOKEN_EXPIRED(1010, "Token has expired", HttpStatus.UNAUTHORIZED),
    TOKEN_INVALID(1011, "Token is invalid", HttpStatus.UNAUTHORIZED);

    private final int code;
    private final String message;
    private final HttpStatusCode statusCode;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }
}
