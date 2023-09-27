package com.example.Aucison_Shipping_Service.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    // Deliveries 관련 에러 코드들
    DELIVERY_NOT_FOUND(HttpStatus.NOT_FOUND, "배송지 정보를 찾을 수 없습니다."),
    DELIVERY_SAVE_FAIL(HttpStatus.INTERNAL_SERVER_ERROR, "배송지 정보 저장에 실패했습니다."),

    //Orders 관련 에러 코드들
    ORDER_NOT_FOUND(HttpStatus.NOT_FOUND, "주문을 찾을 수 없습니다."),
    ORDER_SAVE_FAIL(HttpStatus.INTERNAL_SERVER_ERROR, "주문 정보 저장에 실패했습니다."),

    // Payments 관련 에러 코드들
    CATEGORY_NOT_FOUND(HttpStatus.BAD_REQUEST, "해당 카테고리(경매/판매)가 존재하지 않습니다."),
    AUCTION_ENDED(HttpStatus.FORBIDDEN, "경매가 이미 종료되었습니다."),
    SHIPPING_INFO_NOT_FOUND(HttpStatus.NOT_FOUND, "배송지를 새로 등록해주세요."),
    LOG_NOT_FOUND(HttpStatus.NOT_FOUND, "로그를 찾을 수 없습니다.");


    private final HttpStatus httpStatus;
    private final String message;
}
