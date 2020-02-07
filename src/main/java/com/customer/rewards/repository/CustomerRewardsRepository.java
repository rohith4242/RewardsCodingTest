package com.customer.rewards.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customer.rewards.model.CustomerRewards;

@Repository
public interface CustomerRewardsRepository extends CrudRepository<CustomerRewards, Long>{

	List<CustomerRewards> findByCustomerName(String customerName);
}
