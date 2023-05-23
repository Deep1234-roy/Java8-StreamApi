package com.training;

import com.training.model.Customer;
import com.training.model.CustomerService;

public class MidWestCustomerService implements CustomerService{


	@Override
	public Customer getCustomer(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getCustomerInfo(String id) {
		return CustomerService.super.getCustomerInfo(id);
	}
	
	static public int getCustomerCount() {
		System.out.println("Customer Count Perfomed from MidWestCustomerService....");
		return 0;
	}

}
