
package com.sweethome.controller;
 
import java.util.Collection;	
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sweethome.domain.House;
import com.sweethome.service.HouseService;


@CrossOrigin(maxAge = 3600)
@RestController
public class WebRestController {
	
	@Autowired
    private HouseService houseService;
	
	@RequestMapping("/api/hi")
	public String hi() {
		String message = "Hello World from Restful API";
		return message;
	}
		
    @RequestMapping("/api/houses")
    public @ResponseBody List<House> getHouses() {
    	
    	return this.houseService.getHousesList();
    	
    	//Logger.getLogger(getClass()).info("<CrazyBookings>Retrieve user list <CrazyBookings>");
    	
//    	List<House> houseList =  new ArrayList<House>(); 
//    	
//    	House house1 = new House();
//    	house1.setName("Casa paco");
//    	house1.setDescription("casa de pueblo");
//    	house1.setPrice(1000);
//    	
//    	House house2 = new House();
//    	house2.setName("Casa building");
//    	house2.setDescription("casa de ciudad");
//    	house2.setPrice(2000);
//    	
//    	houseList.add(house1);
//    	houseList.add(house2);
//    	
//        return houseList;
    }
	

	
}