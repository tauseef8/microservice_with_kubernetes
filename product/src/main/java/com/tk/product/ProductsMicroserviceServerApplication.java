package com.tk.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDiscoveryClient
public class ProductsMicroserviceServerApplication {

	public static void main(String[] args) {
		
		/*if (args.length>0)
			System.setProperty("server.port", args[0]);*/
		
		SpringApplication.run(ProductsMicroserviceServerApplication.class, args);
	}
	
}
