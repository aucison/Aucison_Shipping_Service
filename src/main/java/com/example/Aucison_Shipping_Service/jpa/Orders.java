package com.example.Aucison_Shipping_Service.jpa;

import com.example.Aucison_Shipping_Service.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "orders")
public class Orders extends BaseTimeEntity {   //주문 정보
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private Long ordersId; //PK, 주문번호
    @Column(name = "products_id", nullable = false)
    private Long productsId;    //상품 id
    @Column(name = "members_code", nullable = false)
    private String email;   //구매자 이메일

    @Column(name = "created_time", nullable = false)
    private LocalDateTime createdTime;            //주문일자

    @Column(name = "status", nullable = false)
    private Enum status;   //주문상태(낙찰, 응찰, 패찰, 주문완료)

    @OneToOne(mappedBy = "orders")
    private Payments payments;
    @OneToOne(mappedBy = "orders")
    private Deliveries deliveries;

    @Builder
    public Orders(Long productsId, String email,
                  LocalDateTime createdTime, Enum status) {
        this.productsId = productsId;
        this.email = email;
        this.createdTime = createdTime;
        this.status = status;
    }
}