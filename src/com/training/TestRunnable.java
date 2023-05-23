package com.training;

public class TestRunnable {

	public static void main(String[] args) {
		Runnable runner = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Inside Runnable using Anonymous Inner Class");
			}
		};
		
		Thread t1 = new Thread(runner);
		t1.start();

	}

}
