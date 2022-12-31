package com.app.services;

import com.app.model.Product;

public interface ProductService {
	
	Product addProduct(Product p );
	
	Product removeProduct(int id );
	
	Product updateProduct(Product p );
	
	Product getProduct(int id );
	
	Product getAllProduct( );
	
	
	
}
