package com.example.Aucison_Shipping_Service.dto.client;

import lombok.Data;

@Data
public class AddrInfoResponseDto {
    // 가상 결제 내역 조회 시 member-service에서 받아 사용하는 dto
    private String addrName;    //배송지명
    private String name;    //받는분 이름
    private String tel; //받는분 전화번호
    private String zipCode; //우편번호
    private String addr;    //주소
    private String addrDetail;  //상세주소
}
