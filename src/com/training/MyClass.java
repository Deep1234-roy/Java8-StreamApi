package com.training;

import com.training.model.Interface1;
import com.training.model.Interface2;

public class MyClass implements Interface1,Interface2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		obj.method1();
		obj.method2();
		obj.log("Warning");

	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method2 from Interface1");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method1 from Interface1");
		
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.super.log(str);
		Interface2.super.log(str);
		System.out.println("Log OverRidden by MyClass");
	}

}

