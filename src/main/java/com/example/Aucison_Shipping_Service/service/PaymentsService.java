package com.example.Aucison_Shipping_Service.service;

import com.example.Aucison_Shipping_Service.dto.payments.VirtualPaymentResponseDto;

public interface PaymentsService {
    /**
     * 가상 결제 조회
     *
     * @param productsId 상품 ID
     * @param email 사용자 이메일
     * @param addrName 배송지명
     * @param percent 구매자가 올린 퍼센트
     * @return PaymentPageResponse
     */
    VirtualPaymentResponseDto getVirtualPaymentInfo(Long productsId, String email, String addrName, int percent);
}
