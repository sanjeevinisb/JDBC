package com.xworkz.subscription.repository;

import com.xworkz.subscription.dto.SubscriptionDTO;

public interface SubscriptionRepository {
	boolean save(SubscriptionDTO subscriptionDTO);
}
