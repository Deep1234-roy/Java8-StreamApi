package com.training;

import com.training.model.CustomerService;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Legal - calls the static method in the CustomerService interface
		int custcount1 = CustomerService.getCustomerCount();
		
		// Legal - calls the static method in the MidwestCustomerService
		// interface
		int custcount2 = MidWestCustomerService.getCustomerCount();
		
		CustomerService cs = new MidWestCustomerService();
		// Illegal - cannot call a static method,
		// defined in an interface (that contains a body),
		// through an instance variable.
		//cs.getCustomerCount();


	}

}
