package com.training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.training.model.Apple;

public class AppleSorting{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Apple> app = Arrays.asList(
				new Apple(23),
				new Apple(40),
				new Apple(32),
				new Apple(20),
				new Apple(45),
				new Apple(60)
				);
		
		

		app.stream()
			.sorted((a1,a2) -> Integer.compare(a1.getWeight(), a2.getWeight()))
			.forEach(System.out::println);
		Comparator<Apple> com = new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				if(o1.getWeight() > o2.getWeight())
					return o2.getWeight();
				else
					return o1.getWeight();
			}
		};
		
		
	}
	
	

}
