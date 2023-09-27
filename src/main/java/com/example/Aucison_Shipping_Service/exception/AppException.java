package com.example.Aucison_Shipping_Service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AppException extends RuntimeException { //애플리케이션 내부에서 발생하는 비즈니스 예외
    ErrorCode errorCode;    //발생하는 예외 타입과 메시지를 가짐
}
