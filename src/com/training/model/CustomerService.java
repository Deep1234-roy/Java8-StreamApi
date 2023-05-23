package com.training.model;

public interface CustomerService {
	public Customer getCustomer(String id);
	
	public void setCustomer(Customer cust);
	
	default public String getCustomerInfo(String id) {
		return "Customer Info...";
	}
	
	static public int getCustomerCount() {
		System.out.println("Customer Count Perfomed....");
		return 4;
	}

}
