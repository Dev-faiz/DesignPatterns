package com.main;

public class Main {

	public static void main(String[] args) {
		
		
		Product product1 = new Product().builder()
				.id(1)
				.color("Blue").build();
		
		Product product2 = new Product().builder()
				.id(5)
				.name("Awesome")
				.color("Blue").build();
							
		ProductUsingLombok productUsingLombok = new ProductUsingLombok.ProductUsingLombokBuilder().id(1).build();
		
		User user = new User().builder().id(1).build();
				
	}

}
