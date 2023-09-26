package com.example.Aucison_Shipping_Service.jpa;

import com.example.Aucison_Shipping_Service.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "page_access_logs")
public class PageAccessLogs extends BaseTimeEntity {   //페이지 접근 로그
    //필드
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "page_access_logs_id")
    private Long pageAccessLogsId; //PK

//    @Column(name = "access_time", nullable = false)
//    private LocalDateTime accessTime;            //페이지 접근 시간
//    @Column(name = "exit_time", nullable = false)
//    private LocalDateTime exitTime;            //페이지에서 나갈 때의 시간

    @Column(name = "products_id", nullable = false)
    private Long productsId;    //상품 id

    @Column(name = "email", nullable = false)
    private String email;   //이메일

    @Column(name = "page_type", nullable = false)
    private String pageType;   //어떤 페이지에 접근했는지를 나타내는 타입 혹은 이름 (예: "상품상세", "가상결제페이지", "결제완료" 등)
}
