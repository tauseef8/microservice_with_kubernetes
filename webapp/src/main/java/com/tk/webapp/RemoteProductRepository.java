package com.tk.webapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * @author Tauseef.Khan
 *
 */
public class RemoteProductRepository implements ProductRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteProductRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	@Override
	public List<Product> getAllProducts() {
		Product[] accounts = restTemplate.getForObject(serviceUrl+"/products", Product[].class);
		return Arrays.asList(accounts);
	}

	@Override
	public Product getProduct(String name) {
		return restTemplate.getForObject(serviceUrl + "/products/{name}",
				Product.class, name);
	}
	
	

}
