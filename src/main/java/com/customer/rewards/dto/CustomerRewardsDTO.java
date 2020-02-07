package com.customer.rewards.dto;

import java.util.List;

public class CustomerRewardsDTO {
	private Long totalPoints;
	private List<RewardsDTO> rewards;
	
	
	public Long getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(Long totalPoints) {
		this.totalPoints = totalPoints;
	}
	public List<RewardsDTO> getRewards() {
		return rewards;
	}
	public void setRewards(List<RewardsDTO> rewards) {
		this.rewards = rewards;
	}
	
	

}
