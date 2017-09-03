package com.tk.webapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

public class RemoteDealOfDayRepository implements DealOfDayRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String serviceUrl;
	
	public RemoteDealOfDayRepository(String serviceUrl) {
		this.serviceUrl = serviceUrl.startsWith("http") ? serviceUrl
				: "http://" + serviceUrl;
	}
	
	
	
	@Override
	public List<DealOfDay> getAllDealOfDays() {
		DealOfDay[] customers = restTemplate.getForObject(serviceUrl+"/dealofdays", DealOfDay[].class);
		return Arrays.asList(customers);
	}

	@Override
	public DealOfDay getDealOfDay(String name) {
		return restTemplate.getForObject(serviceUrl + "/dealofdays/{name}",
				DealOfDay.class, name);
	}

}
