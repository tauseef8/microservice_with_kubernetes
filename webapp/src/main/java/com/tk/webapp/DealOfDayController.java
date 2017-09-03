/**
 * 
 */
package com.tk.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Tauseef.Khan
 *
 */
@Controller
public class DealOfDayController implements ErrorController {
	
	@Autowired
	DealOfDayRepository dealOfDayRepository;
	
	private static final String PATH = "/error";

    @RequestMapping("/error")
    public String error() {
        return "error";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
	
	@RequestMapping("/dealOfDayList")
	public String dealOfDayList(Model model) {
		model.addAttribute("dealOfDays", dealOfDayRepository.getAllDealOfDays());
		return "dealOfDayList";
	}
	
	@RequestMapping("/dealOfDayDetails")
	public String dealOfDayDetails(@RequestParam("name") String name, Model model) {
		model.addAttribute("dealOfDay", dealOfDayRepository.getDealOfDay(name));
		return "dealOfDayDetails";
	}
}
