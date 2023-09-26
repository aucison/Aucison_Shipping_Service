package com.example.Aucison_Shipping_Service.client;

import com.example.Aucison_Shipping_Service.dto.client.ProductInfoResponseDto;
import com.example.Aucison_Shipping_Service.dto.client.VirtualPaymentProductInfoResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.time.LocalDateTime;

@FeignClient(name = "product-service")
public interface ProductServiceClient { //product-service와 통신

    //주문 내역 조회 시 products_id로 product 정보를 가져옴
    @GetMapping("/products/{products_id}")
    ProductInfoResponseDto getOrderProductByProductsId(@PathVariable("products_id") Long productsId);

    //가상 결제 페이지 조회 시 products_id로 product 정보를 가져옴
    @GetMapping("/products/{products_id}/virtualPayment")
    VirtualPaymentProductInfoResponseDto getVirtualPaymentProductByProductsId(@PathVariable("products_id") Long productsId);

    //products_id로 경매 종료 날짜를 가져옴
    @GetMapping("/products/{productsId}/endDate")
    LocalDateTime getAuctionEndDateByProductId(@PathVariable Long productsId);
}
