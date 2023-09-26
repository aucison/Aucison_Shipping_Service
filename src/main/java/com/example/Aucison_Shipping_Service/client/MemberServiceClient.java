package com.example.Aucison_Shipping_Service.client;

import com.example.Aucison_Shipping_Service.dto.client.AddrInfoResponseDto;
import com.example.Aucison_Shipping_Service.dto.client.UpdateCreditRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "member-service")
public interface MemberServiceClient {  //member-service와 통신
    //email로 사용자의 credit을 가져옴
    @GetMapping("/members/credits/{email}")
    Float getCreditByEmail(@PathVariable("email") String email);

    //credit 정보 업데이트
    @PatchMapping("/members/credits/update")
    void updateCreditByEmail(@RequestBody UpdateCreditRequestDto updateCreditRequestDto);

    //email과 addrName으로 사용자의 배송지를 가져옴
    @GetMapping("/members/shipping-info")
    AddrInfoResponseDto getShippingInfo(@RequestParam("email") String email, @RequestParam("addrName") String addrName);
}
