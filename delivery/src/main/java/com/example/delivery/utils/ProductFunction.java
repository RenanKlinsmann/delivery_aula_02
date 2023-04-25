package com.example.delivery.utils;

import java.util.function.Function;

import com.example.delivery.entities.Product;

public class ProductFunction implements Function<Product, Product>{

	@Override
	public Product apply(Product t) {
		t.setName(t.getName().toUpperCase());
		return t;
	}

}
