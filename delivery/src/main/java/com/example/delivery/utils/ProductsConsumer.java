package com.example.delivery.utils;

import java.util.function.Consumer;

import com.example.delivery.entities.Product;

public class ProductsConsumer implements Consumer<Product>{

	@Override
	public void accept(Product t) {
		 t.setPrice(t.getPrice() + 5);
	}

}
