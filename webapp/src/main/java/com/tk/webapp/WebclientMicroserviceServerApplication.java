package com.tk.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@SpringBootApplication
//@EnableDiscoveryClient
public class WebclientMicroserviceServerApplication extends SpringBootServletInitializer{
	
	public static final String PRODUCTS_SERVICE_URL = "http://35.194.140.239:8080";
	
	public static final String DEALOFDAYS_SERVICE_URL = "http://35.194.213.31:8080";
	
	@Override
	protected SpringApplicationBuilder  configure(SpringApplicationBuilder  application) {
		return application.sources(WebclientMicroserviceServerApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebclientMicroserviceServerApplication.class, args);
	}
	
	
	@Bean
	//@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	@Bean
	public ProductRepository accountRepository(){
		return new RemoteProductRepository(PRODUCTS_SERVICE_URL);
	}
	
	@Bean
	public DealOfDayRepository customerRepository(){
		return new RemoteDealOfDayRepository(DEALOFDAYS_SERVICE_URL);
	}
}
