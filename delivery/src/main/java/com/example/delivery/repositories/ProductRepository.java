package com.example.delivery.repositories;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.el.parser.AstListData;
import org.springframework.stereotype.Repository;

import com.example.delivery.entities.Product;

@Repository
public class ProductRepository {
	
	public List<String> findAll(){
		List<String> teste = new ArrayList<>();
		teste.add("teste 1");
		teste.add("teste 2");
		teste.add("teste 3");
		teste.add("teste 4");
		teste.add("teste 5");
		return teste;
	}
	
	public List<Product> findAllProducts(){
		List<Product> teste = new ArrayList<>();
		teste.add(new Product(1L, "deste 1", 8.0, "teste 1 descricao", "http:/teste1"));
		teste.add(new Product(2L, "teste 2", 5.0, "teste 2 descricao", "http:/teste2"));
		teste.add(new Product(3L, "aeste 3", 15.0, "teste 3 descricao", "http:/teste3"));
		teste.add(new Product(4L, "teste 4", 7.0, "teste 4 descricao", "http:/teste4"));
		teste.add(new Product(5L, "teste 4", 4.0, "teste 4 descricao"));
		
		
		//teste.removeIf(new ProductsPredicate()); /*Metodo implementado*/
		//teste.removeIf(Product::nonStaticPredicatMetodo); /*Chamada não statica metodo na classe*/
		/*Predicate<Product> predicate = p1 -> p1.getPrice() > 8.0;
		teste.removeIf(predicate);*/ /*Lambda declarada*/
		//teste.removeIf(p1 -> p1.getPrice() > 7.0); /*Lambda inline*/
		
		//consumer
		//teste.forEach(new ProductsConsumer());/*Metodo implementado*/
		//teste.forEach(Product::staticConsumerMetodo);/*Chamada statica metodo na classe*/
		//teste.forEach(Product::nonStaticConsumerMetodo);/*Chamada não statica metodo na classe*/
		
		/*Consumer<Product> consumer = p -> p.setPrice(p.getPrice() * 10);
		teste.forEach(consumer);*//*Lambda declarada*/
		
		//teste.forEach(p -> p.setPrice(p.getPrice() * 15));
		
				
		double avg = teste.stream()
				.map(p -> p.getPrice())
				.reduce(0.0, (x, y) -> x + y) / teste.size();
		
		System.out.println(avg);
		
		Comparator<String> comp = (p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase()); 
		
		List<String> nomes = teste.stream()
				.filter(p -> p.getPrice() < avg)
				.map(p -> p.getName())
				.sorted(comp)
				.distinct()
				.limit(1)
				.collect(Collectors.toList());
		
		List<List<String>> nometeste  = new ArrayList<>();
					
		nomes.forEach(System.out::println);
	
		
		
		return teste;
	}
	
}
