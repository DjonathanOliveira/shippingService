package com.ShipmentProjectSpring.services;

import com.ShipmentProjectSpring.entities.Order;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total (@NotNull Order order){
        return shippingService.shipment(order);
    }
}
