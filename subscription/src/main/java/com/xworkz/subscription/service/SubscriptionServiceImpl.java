package com.xworkz.subscription.service;

import com.xworkz.subscription.dto.SubscriptionDTO;
import com.xworkz.subscription.repository.SubscriptionRepoImpl;

public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public boolean save(SubscriptionDTO subscriptionDTO) {
        boolean valid = true;
        if (subscriptionDTO != null) {
            System.out.println("subscriptionDTO is not null");

            String name = subscriptionDTO.getName();
            if (name != null && !name.isEmpty() && name.length() >= 4 && name.length() <= 30) {
                System.out.println("Name is valid");
            } else {
                System.err.println("Name is invalid");
                valid = false;
            }

            String phoneNumber = subscriptionDTO.getPhoneNumber();
            if (phoneNumber != null && phoneNumber.length() == 10 && phoneNumber.startsWith("9")) {
                System.out.println("Phone Number is valid");
            } else {
                valid = false;
                System.err.println("Phone Number is invalid");
            }

            String email = subscriptionDTO.getEmail();
            if (email != null && email.contains("@") && email.contains("gmail.com")
                    && Character.isUpperCase(email.charAt(0)) && email.indexOf('@') == 7) {
                System.out.println("Email is valid");
            } else {
                valid = false;
                System.err.println("Email is invalid");
            }

            String address = subscriptionDTO.getAddress();
            if (address != null && !address.isEmpty()) {
                System.out.println("Address is valid");
            } else {
                valid = false;
                System.err.println("Address is not valid");
            }

            String subscriptionType = subscriptionDTO.getSubscriptionType();
            if (subscriptionType != null && !subscriptionType.isEmpty()) {
                System.out.println("Subscription Type is valid");
            } else {
                valid = false;
                System.err.println("Subscription Type is invalid");
            }
        } else {
            valid = false;
            System.err.println("SubscriptionDTO is null");
        }

        if (valid) {
            SubscriptionRepoImpl subscriptionRepoImpl = new SubscriptionRepoImpl();
            return subscriptionRepoImpl.save(subscriptionDTO);
        } else {
            System.err.println("Data is invalid");
            return false;
        }
    }
}
