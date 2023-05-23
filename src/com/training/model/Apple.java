package com.training.model;

public class Apple {

	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Apple [weight=" + weight + "]";
	}

	public Apple(int weight) {
		super();
		this.weight = weight;
	}

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
