package com.thirdExercise.obspringData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObSpringDataApplication.class, args);
		ProductRepository repository = context.getBean(ProductRepository.class);

		System.out.println("Number of products in database: " + repository.count());

		// Create and store a Product in database
		Product productA = new Product(null, "Product A", 25.38, "Brand A");
		repository.save(productA);

		System.out.println("Number of products after insert in database: " + repository.count());

		// Get all records from database
		System.out.println(repository.findAll());
	}

}
