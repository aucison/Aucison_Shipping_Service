package com.example.Aucison_Shipping_Service.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "auction_end_dates")
public class AuctionEndDates {   //경매 종료 날짜 관리

    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "auction_end_dates_id")
    private Long auctionEndDatesId; //PK

    @Column(name = "products_id", nullable = false)
    private Long productsId;    //상품 id

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;    //경매 종료일
}
