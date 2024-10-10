package com.ShipmentProjectSpring.test;

import com.ShipmentProjectSpring.entities.Order;
import com.ShipmentProjectSpring.services.OrderService;
import com.ShipmentProjectSpring.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ShipmentProjectApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {

	}

	public ShipmentProjectApplication() {

	}

	public static void main(String[] args) {
		SpringApplication.run(ShipmentProjectApplication.class, args);
		Locale locale = Locale.US;

		Order order = new Order(1034, 95.9, 0);
		ShippingService shippingService = new ShippingService();
		shippingService.shipment(order);
		OrderService orderService = new OrderService(shippingService);
		double totalOrder = orderService.total(order);

		System.out.println("Código do pedido : " + order.getCode() +
				"\n" + "Valor total do pedido : R$ " + totalOrder);
	}

}
