package com.example.Aucison_Shipping_Service.dto.client;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ProductInfoResponseDto {
    private String productName; //상품명
    private MultipartFile productImg; //상품 사진
    private String productDescription;  //상품 간단 설명
    private String category; // 경매여부(경매/비경매)
    private float price; //구매 가격

}
