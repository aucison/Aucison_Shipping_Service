package com.example.Aucison_Shipping_Service.client;

import com.example.Aucison_Shipping_Service.dto.client.ProductInfoResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service")
public interface ProductServiceClient { //product-service와 통신

    //주문 내역 조회 시 products_id로 product 정보를 가져옴
    @GetMapping("/products/{products_id}")
    ProductInfoResponseDto getOrderProductByProductsId(@PathVariable("products_id") Long productsId);
}
