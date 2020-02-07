package com.customer.rewards.service;

import java.util.List;

import com.customer.rewards.dto.CustomerRewardsDTO;
import com.customer.rewards.model.CustomerRewards;

public interface CustomerRewardsService {

	CustomerRewardsDTO getCustomerRewards(String customerName);
	void caluclateRewards(List<CustomerRewards> list);
}
