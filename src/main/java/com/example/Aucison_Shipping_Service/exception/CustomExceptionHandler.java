package com.example.Aucison_Shipping_Service.exception;

import com.example.Aucison_Shipping_Service.dto.ApiResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice   //RESTful 웹 서비스에서 전역 예외 처리를 위한 어노테이션
public class CustomExceptionHandler {
    @ExceptionHandler(AppException.class)   //AppException 타입의 예외가 발생하면 해당 메서드로 처리하겠다는 어노테이션
    public ApiResponse<?> handleCustomException(AppException e) {
        return ApiResponse.createError(e.getErrorCode().getHttpStatus(), e.getErrorCode().getMessage());
    }
}
