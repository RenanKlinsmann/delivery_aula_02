package com.example.delivery.utils;

import java.util.Comparator;

import com.example.delivery.entities.Product;

public class ProductComporator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
