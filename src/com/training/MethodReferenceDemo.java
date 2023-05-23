package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using method reference
		System.out.println("\n------------Lambda Expression-------------------");
		Stream.of(3,4,7,1,2,3).forEach(System.out::println);
		
		// Assigning the method reference to a functional interface
		System.out.println("\n------------Method Reference using Functional Interface-------------------");
		Consumer<Integer> printer = System.out::println;
		Stream.of(89,367,29,88,16).forEach(printer);
		
		// method reference to a static method
		System.out.println("\n------------Method Reference to a Static Method-------------------");
		Stream.generate(Math::random)
		.limit(10)
		.forEach(System.out::println);
		
		// invoking a multiple argument instance method from a class 
		//reference
		System.out.println("\n------------Method Reference with Mulitple Arguments-------------------");
		List<String> strings = Arrays.asList("this","is","a","demo","string","of","list");
		List<String> sortedList=strings.stream()
			.sorted(String::compareTo)
			.collect(Collectors.toList());
		System.out.println("Sorted List = " + sortedList);
		
		// invoking the length method on String using a method reference
		System.out.println("\n------------Method Reference to String Method -------------------");

		Stream.of("this", "is", "a", "stream", "of", "strings")
			.map(String::length)
			.forEach(System.out::println);

	}

}
