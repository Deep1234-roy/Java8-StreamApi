package com.training;

public class RunnableLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runner = () -> System.out.println("Run method implemented using Lambda Expression");
		Thread t1 = new Thread(runner);
		t1.start();

	}

}
