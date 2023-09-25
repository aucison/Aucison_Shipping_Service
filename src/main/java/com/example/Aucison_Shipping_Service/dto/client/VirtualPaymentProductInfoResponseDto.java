package com.example.Aucison_Shipping_Service.dto.client;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class VirtualPaymentProductInfoResponseDto {
    // 가상 결제 내역 조회 시 product-service에서 받아 사용하는 dto
    private String productName; //상품명
    private MultipartFile productImg; //상품 사진
    private String category;    //경매여부(경매/비경매)
    private String bidsCode;    //(경매) 응찰 고유 번호
    private Float price;    //(비경매) 등록 가격
    private String productDescription;  //상품 한줄설명
}