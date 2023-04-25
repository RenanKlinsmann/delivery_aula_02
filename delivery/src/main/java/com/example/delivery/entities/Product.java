package com.example.delivery.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable, Comparable<Product> {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imageUri;
	
	public Product() {}

	public Product(Long id, String name, Double price, String description, String imageUri) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUri = imageUri;
	}
	
	public Product(Long id, String name, Double price, String description) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	public static boolean staticPredicatMetodo(Product p) {
		return p.getPrice() > 7.0;
	}
	
	public boolean nonStaticPredicatMetodo() {
		return this.price < 7.0;
	}
	
	public static void staticConsumerMetodo(Product p) {
		p.setPrice(p.getPrice() * 5);
	}
	
	public void nonStaticConsumerMetodo() {
		this.setPrice(this.getPrice() - 2);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", imageUri=" + imageUri + "]";
	}

	@Override
	public int compareTo(Product p) {
		if(this.getPrice() > p.getPrice()) {
			return 1;
		}
		if(this.getPrice() < p.getPrice()) {
			return -1;
		}
		return 0;
	}
	
	
	
	
	

}
