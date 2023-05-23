package com.training;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.training.model.Golfer;

public class SortStream {

	public static void main(String[] args) {
		List<String> sample = Arrays.asList("this", "is", "a", "list", "of", "strings");

		List<String> sortedList =sample.stream()
				.sorted()
				.collect(Collectors.toList());

		System.out.println("Sorted List = > " + sortedList);

		//sort using Lambda
		List<String> sortedListUsingLambda =sample.stream()
				.sorted((s1,s2) -> Integer.compare(s1.length(), s2.length()))
				.collect(Collectors.toList());
		System.out.println("Sorted List => " + sortedListUsingLambda);

		// sorting based on multiple columns
		List<Golfer> golfers = Arrays.asList(
				new Golfer("Jack", "Nicklaus", 68),
				new Golfer("Tiger", "Woods", 70),
				new Golfer("Tom", "Watson", 70),
				new Golfer("Ty", "Webb", 68),
				new Golfer("Bubba", "Watson", 70)
				);

		List<Golfer> sortByScoreThenLastThenFirst = 
				golfers.stream().sorted(Comparator.comparingInt(Golfer::getScore)
						.thenComparing(Golfer::getLast)
						.thenComparing(Golfer::getFirst))
				.collect(Collectors.toList());
		System.out.println("\n Multiple Sort: " + 
				sortByScoreThenLastThenFirst);

		//Write a code to sort a stream of string values in reverse order
		List<String> sampleStrings = Arrays.asList("this", "is", "a", "list", "of", "strings");
		sampleStrings.stream()
					.sorted(Comparator.reverseOrder())
					.forEach(System.out::println);
		

	}

}
