package com.training.model;

public class Customer {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + "]";
	}

	public Customer(String id) {
		super();
		this.id = id;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
