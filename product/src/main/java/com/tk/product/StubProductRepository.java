package com.tk.product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author Tauseef.Khan
 *
 */
@Repository
public class StubProductRepository implements ProductRepository {
	
	private Map<String, Product> productsByName = new HashMap<String, Product>();
	
	public StubProductRepository() {
		Product product = new Product(500.00, "JNJ" , "Baby-oil", "Baby-oil.jpg");
		productsByName.put("Baby-oil", product);
		product = new Product(600.50, "JNJ" , "Baby-lotion", "Baby-lotion.jpg");
		productsByName.put("Baby-lotion", product);
		product = new Product(254.50, "JNJ" , "Band-aid", "Band-aid.jpg");
		productsByName.put("Band-aid", product);
		product = new Product(600.50, "JNJ" , "Baby-wash", "Baby-wash.jpg");
		productsByName.put("Baby-wash", product);
		product = new Product(200.50, "JNJ" , "Baby-shampoo", "Baby-shampoo.jpg");
		productsByName.put("Baby-shampoo", product);
		product = new Product(300.50, "JNJ" , "Face-wash", "Face-wash.jpg");
		productsByName.put("Face-wash", product);
		
		Logger.getLogger(StubProductRepository.class).info("Created StubProductRepository");
	}
	
	@Override
	public List<Product> getAllProducts() {
		return new ArrayList<Product>(productsByName.values());
	}

	@Override
	public Product getProduct(String name) {
		return productsByName.get(name);
	}

}
