package com.example.Aucison_Shipping_Service.service;

import com.example.Aucison_Shipping_Service.client.ProductServiceClient;
import com.example.Aucison_Shipping_Service.dto.client.VirtualPaymentProductInfoResponseDto;
import com.example.Aucison_Shipping_Service.dto.payments.VirtualPaymentResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    private final ProductServiceClient productServiceClient;

    @Autowired
    public PaymentsServiceImpl(ProductServiceClient productServiceClient) {
        this.productServiceClient = productServiceClient;
    }

    @Override
    public VirtualPaymentResponseDto getVirtualPaymentInfo(Long productsId, String email,
                                                           String addrName, int percent) {  //가상 결제
        //MSA 통신을 사용하여 product-service에서 product 정보 가져오기
        VirtualPaymentProductInfoResponseDto product = productServiceClient.getVirtualPaymentProductByProductsId(productsId);

//        Float nowPrice = null;  //실시간 가격
//        if ("AUCS".equals(product.getCategory())) { //경매 상품이라면 bids에서 실시간 가격 정보를 받아옴
//            Bids bid = bidsRepository.findByBidsCode(product.getBidsCode());
//            nowPrice = bid.getNowPrice();
//        }

//        //MSA 통신을 사용하여 member-service에서 배송지 정보 가져오기
//        AddrInfoResponseDto addrInfoResponseDto = memberServiceClient.getShippingInfo(email, addrName);
//        if (addrInfoResponseDto == null) {
//            throw new RuntimeException("배송지를 새로 등록해주세요.");
//        }

//        // MSA 통신을 사용하여 member-service에서 credit 정보 가져오기
//        float currentCredit = memberServiceClient.getCreditByEmail(email);
//
//        //현재 credit에서 nowPrice가 null이면 비경매 상품이므로 등록 가격을 차감
//        //nowPrice가 null이 아니면 경매 상품이므로 실시간 가격을 차감
//        float newCredit = currentCredit - (nowPrice != null ? nowPrice : product.getPrice());

//        nowPrice = nowPrice + (nowPrice * (percent / 100));   //응찰가
//        return VirtualPaymentResponseDto.builder()
//                .category(product.getCategory())
//                .name(product.getProductName())
//                .productImg(product.getProductImg())
//                .nowPrice(nowPrice)
//                .price(product.getPrice())
//                .addrName(addrInfoResponseDto.getAddrName())
//                .name(addrInfoResponseDto.getName())
//                .tel(addrInfoResponseDto.getTel())
//                .zipCode(addrInfoResponseDto.getZipCode())
//                .addr(addrInfoResponseDto.getAddr())
//                .addrDetail(addrInfoResponseDto.getAddrDetail())
//                .credit(currentCredit)
//                .newCredit(newCredit)
//                .build();
        return null;
    }
}
