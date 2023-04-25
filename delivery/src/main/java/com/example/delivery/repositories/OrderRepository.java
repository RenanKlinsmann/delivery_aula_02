package com.example.delivery.repositories;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.delivery.entities.Order;
import com.example.delivery.entities.OrderStatus;
import com.example.delivery.entities.Product;

@Repository
public class OrderRepository {
	
	public List<Order> findAllOrders(){
		HashSet<Product> products = new HashSet<>();
		products.add(new Product(1L, "teste 1", 1.0, "teste 1 descricao", "http:/teste1"));
		products.add(new Product(2L, "teste 2", 2.0, "teste 2 descricao", "http:/teste2"));
		products.add(new Product(3L, "teste 3", 3.0, "teste 3 descricao", "http:/teste3"));
		products.add(new Product(4L, "teste 4", 4.0, "teste 4 descricao", "http:/teste4"));
		List<Order> orders = new ArrayList<>();
		
		orders.add(new Order(1L,"rua teste 1", -21.55555, -22.222222, Instant.now(), OrderStatus.PENDING, products));
		orders.add(new Order(2L,"rua teste 2", -21.55555, -22.222222, Instant.now(), OrderStatus.PENDING, products));
		orders.add(new Order(3L,"rua teste 3", -21.55555, -22.222222, Instant.now(), OrderStatus.PENDING, products));
		orders.add(new Order(5L,"rua teste 4", -21.55555, -22.222222, Instant.now(), OrderStatus.PENDING, products));
		
		return orders;
	}

}
