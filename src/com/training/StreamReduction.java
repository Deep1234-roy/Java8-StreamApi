package com.training;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamReduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = "this is an array of strings".split(" ");
		long count = Arrays.stream(strings)
				.map(String::length)
				.count();
		System.out.println("There is a total of " + count + " Strings");

		int totalLength = Arrays.stream(strings)
				.mapToInt(String::length)
				.sum();
		System.out.println("Total Length = " + totalLength);

		OptionalDouble avergaeLength=Arrays.stream(strings)
				.mapToInt(String::length)
				.average();
		System.out.println("Average Length = " + avergaeLength);

		OptionalInt maximumLength = Arrays.stream(strings)
				.mapToInt(String::length)
				.max();

		OptionalInt minimumLength = Arrays.stream(strings)
				.mapToInt(String::length)
				.min();
		System.out.println("The Max and Min Lengths are = " + maximumLength + " and " + minimumLength);

		//Use IntStream to accept numbers from 1 to 10 and perform sum on them.
		//To achieve this, you have to use 
		//this method of reduction: OptionalInt reduce(IntBinaryOperator op)
		//The IntBinaryOperator will be supplied with a lambda expression that takes two ints
		//and return their sum. 
		//Also, use orElse() method of OptionalInt to return zero if there are no element in the stream.

		IntStream stream = IntStream.range(1,11);
		int no =stream.reduce(Integer::sum)
				.orElse(0);
		System.out.println(no);


	}

}
