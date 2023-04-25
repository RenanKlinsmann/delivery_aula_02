package com.example.delivery.utils;

import java.util.function.Predicate;

import com.example.delivery.entities.Product;

public class ProductsPredicate implements Predicate<Product> {

	@Override
	public boolean test(Product t) {
		return t.getPrice() < 7.0;
	}

}
