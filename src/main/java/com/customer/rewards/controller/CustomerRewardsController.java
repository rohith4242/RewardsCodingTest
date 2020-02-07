package com.customer.rewards.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.rewards.dto.CustomerRewardsDTO;
import com.customer.rewards.model.CustomerRewards;
import com.customer.rewards.service.CustomerRewardsService;

@RestController
public class CustomerRewardsController {
	@Autowired
	private CustomerRewardsService rewardsService;
	
	@GetMapping("/getCustomerRewards")
	public CustomerRewardsDTO getCustomerRewards(String customerName) throws ParseException{
		return rewardsService.getCustomerRewards(customerName);
	}
	
	@GetMapping("/dataCreation")
	public void createDateSet() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		CustomerRewards r1 = new CustomerRewards();
		r1.setCustomerName("c1");
		r1.setPurchaseAmount(200);
		r1.setCreatedDate(sdf.parse("04/02/2020"));
		
		CustomerRewards r2 = new CustomerRewards();
		r2.setCustomerName("c1");
		r2.setPurchaseAmount(110);
		r2.setCreatedDate(sdf.parse("05/01/2020"));
		
		CustomerRewards r3 = new CustomerRewards();
		r3.setCustomerName("c1");
		r3.setPurchaseAmount(130);
		r3.setCreatedDate(sdf.parse("05/02/2020"));
		
		CustomerRewards r4 = new CustomerRewards();
		r4.setCustomerName("c1");
		r4.setPurchaseAmount(40);
		r4.setCreatedDate(sdf.parse("06/02/2020"));
		
		// 2nd Customer
		CustomerRewards c1 = new CustomerRewards();
		c1.setCustomerName("c2");
		c1.setPurchaseAmount(140);
		c1.setCreatedDate(sdf.parse("03/01/2020"));
		
		CustomerRewards c2 = new CustomerRewards();
		c2.setCustomerName("c2");
		c2.setPurchaseAmount(70);
		c2.setCreatedDate(sdf.parse("06/02/2020"));
		
		List<CustomerRewards> list = new ArrayList<>();
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		list.add(c1);
		list.add(c2);
		
		rewardsService.caluclateRewards(list);
		
	}
}
