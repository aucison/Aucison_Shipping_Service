package com.example.Aucison_Shipping_Service.service;

import com.example.Aucison_Shipping_Service.dto.deliveries.DeliveriesCreateDto;
import com.example.Aucison_Shipping_Service.dto.deliveries.DeliveriesResponseDto;
import com.example.Aucison_Shipping_Service.jpa.Deliveries;
import com.example.Aucison_Shipping_Service.jpa.DeliveriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliveriesServiceImpl implements DeliveriesService {
    private final DeliveriesRepository deliveriesRepository;

    @Autowired
    public DeliveriesServiceImpl(DeliveriesRepository deliveriesRepository) {
        this.deliveriesRepository = deliveriesRepository;
    }

    @Override
    public Long saveDelivery(DeliveriesCreateDto deliveriesCreateDto) {
        Deliveries delivery = Deliveries.builder()
                .addrName(deliveriesCreateDto.getAddrName())
                .zipNum(deliveriesCreateDto.getZipNum())
                .addr(deliveriesCreateDto.getAddr())
                .addrDetail(deliveriesCreateDto.getAddrDetail())
                .name(deliveriesCreateDto.getName())
                .tel(deliveriesCreateDto.getTel())
                .isCompleted(deliveriesCreateDto.isCompleted())
                .isStarted(deliveriesCreateDto.isStarted())
                .build();

        delivery = deliveriesRepository.save(delivery);
        return delivery.getDeliveriesId();
    }

    @Override
    @Transactional(readOnly = true)
    public DeliveriesResponseDto getDeliveryByOrdersId(Long ordersId) {
        //orders_id로 배송지 정보 조회
        Deliveries delivery = deliveriesRepository.findByOrdersOrdersId(ordersId);

        return DeliveriesResponseDto.builder()
                .addrName(delivery.getAddrName())
                .name(delivery.getName())
                .addr(delivery.getAddr())
                .addrDetail(delivery.getAddrDetail())
                .tel(delivery.getTel())
                .isCompleted(delivery.isCompleted())
                .isStarted(delivery.isStarted())
                .build();
    }
}