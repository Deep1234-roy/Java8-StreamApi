package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxedStream {

	public static void main(String[] args) {
		//Using the boxed method
		Object[] ints = IntStream.of(3, 1, 4, 1, 5, 9)
				.mapToObj(x->x).toArray();
		System.out.println("Integers: " + Arrays.toString(ints));

		// Using the mapToObj method to convert each element from a primitive to an instance of the 
		//wrapper class
		List<Integer> integers = IntStream.of(3, 1, 4, 1, 5, 9)
		.mapToObj(Integer::valueOf)
		.collect(Collectors.toList());
		System.out.println("Integers: " + integers);

	}

}
