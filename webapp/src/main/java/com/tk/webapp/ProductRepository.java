/**
 * 
 */
package com.tk.webapp;

import java.util.List;

/**
 * @author Tauseef.Khan
 *
 */
public interface ProductRepository {
	
	List<Product> getAllProducts();
	
	Product getProduct(String name);
}
