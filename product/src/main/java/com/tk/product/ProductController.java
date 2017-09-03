/**
 * 
 */
package com.tk.product;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tauseef.Khan
 *
 */
@RestController
public class ProductController {

	protected Logger logger = Logger
			.getLogger(ProductController.class.getName());
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping("/products")
	public Product[] all() {
		logger.info("products-microservice all() invoked");
		List<Product> products = productRepository.getAllProducts();
		logger.info("products-microservice all() found: " + products.size());
		return products.toArray(new Product[products.size()]);
	}
	
	@RequestMapping("/products/{name}")
	public Product byId(@PathVariable("name") String name) {
		logger.info("products-microservice byId() invoked: " + name);
		Product product = productRepository.getProduct(name);
		logger.info("products-microservice byId() found: " + product);
		return product;
	}
}
