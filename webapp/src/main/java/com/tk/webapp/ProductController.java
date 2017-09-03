/**
 * 
 */
package com.tk.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Tauseef.Khan
 *
 */
@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping("/")
	public String index(Model model){
		model.addAttribute("products", productRepository.getAllProducts());
		return "index";
	}
	@RequestMapping("/productList")
	public String productList(Model model) {
		model.addAttribute("products", productRepository.getAllProducts());
		return "productList";
	}
	
	@RequestMapping("/productDetails")
	public String productDetails(@RequestParam("name") String name, Model model) {
		model.addAttribute("product", productRepository.getProduct(name));
		return "productDetails";
	}
}
