package com.ShipmentProjectSpring.services;

import com.ShipmentProjectSpring.entities.Order;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(@NotNull Order order){
        if(order.getPrice() <  100){
            double shipmentRate = 20;
            double fullPrice = order.getPrice() - (order.getPrice() * order.getDiscount())  + shipmentRate;
            return fullPrice;
        } else if (order.getPrice() < 200) {
            double shipmentRate = 12;
            double fullPrice = order.getPrice() - (order.getPrice() * order.getDiscount()) + shipmentRate;
            return fullPrice;
        }else {
            double shipmentRate = 0;
            double fullPrice = order.getPrice() - (order.getPrice() * order.getDiscount());
            return fullPrice;
        }
    }
}
