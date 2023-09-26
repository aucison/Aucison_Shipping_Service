package com.example.Aucison_Shipping_Service.dto.client;

import lombok.Builder;
import lombok.Data;

@Data
public class UpdateCreditRequestDto {
    //환불 시 사용자 credit 업데이트를 위해 사용하는 dto
    private String email;   //이메일
    private float credit;   //사용자 자산

    @Builder
    public UpdateCreditRequestDto(String email, float credit) {
        this.email = email;
        this.credit = credit;
    }
}
