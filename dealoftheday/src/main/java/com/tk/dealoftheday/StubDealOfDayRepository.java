package com.tk.dealoftheday;

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
public class StubDealOfDayRepository implements DealOfDayRepository {
	
	private Map<String, DealOfDay> dealOfDaysByName = new HashMap<String, DealOfDay>();
	
	public StubDealOfDayRepository() {
		DealOfDay dealOfDay = new DealOfDay(102.00, "20%" , "Listerine", "12", 3000.00, "Listerine.jpg" );
		dealOfDaysByName.put("Listerine", dealOfDay);
		dealOfDay = new DealOfDay(1002.00, "10%" , "Baby-powder", "5", 12000.00, "Baby-powder.jpg" );
		dealOfDaysByName.put("Baby-powder", dealOfDay);
		dealOfDay = new DealOfDay(1002.00, "15%" , "Baby-wash", "3", 10000.00, "Baby-wash.jpg");
		dealOfDaysByName.put("Baby-wash", dealOfDay);
		dealOfDay = new DealOfDay(1002.00, "12%" , "Baby-wipe", "3", 9000.00, "Baby-wipe.jpg");
		dealOfDaysByName.put("Baby-wipe", dealOfDay);
		dealOfDay = new DealOfDay(1002.00, "14%" , "Face-wash", "3", 8000.00, "Face-wash.jpg");
		dealOfDaysByName.put("Face-wash", dealOfDay);
		Logger.getLogger(StubDealOfDayRepository.class).info("Created StubdealOfDayRepository");
	}
	
	@Override
	public List<DealOfDay> getAllDealOfDays() {
		
		List<DealOfDay> productMod= new ArrayList<DealOfDay>();
		productMod.add(dealOfDaysByName.get("Baby-powder"));
		productMod.add(dealOfDaysByName.get("Baby-wash"));
		productMod.add(dealOfDaysByName.get("Baby-wipe"));
		return productMod;
		
		/*return new ArrayList<DealOfDay>(dealOfDaysByName.values());*/
	}

	@Override
	public DealOfDay getDealOfDay(String name) {
		return dealOfDaysByName.get(name);
	}

}
