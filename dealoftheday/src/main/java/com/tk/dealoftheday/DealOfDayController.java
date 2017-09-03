/**
 * 
 */
package com.tk.dealoftheday;

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
public class DealOfDayController {

	protected Logger logger = Logger
			.getLogger(DealOfDayController.class.getName());
	
	@Autowired
	DealOfDayRepository dealofdayRepository;
	
	@RequestMapping("/dealofdays")
	public DealOfDay[] all() {
		logger.info("dealofdays-microservice all() invoked");
		List<DealOfDay> dealofdays = dealofdayRepository.getAllDealOfDays();
		logger.info("dealofdays-microservice all() found: " + dealofdays.size());
		return dealofdays.toArray(new DealOfDay[dealofdays.size()]);
	}
	
	@RequestMapping("/dealofdays/{name}")
	public DealOfDay byId(@PathVariable("name") String name) {
		logger.info("dealofdays-microservice byId() invoked: " + name);
		DealOfDay dealofday = dealofdayRepository.getDealOfDay(name);
		logger.info("dealofdays-microservice byId() found: " + dealofday);
		return dealofday;
	}
}
