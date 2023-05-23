package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GroupStream {

	public static void main(String[] args) {
		// use partitioningBy - to split strings into those with even lengths 
		// and those with odd lengths
		
		System.out.println("\n---------Partitioning----------------");
		List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of", "strings", "to", "use", "as", "a", "demo");
		Map<Boolean, List<String>> lengthOfString=strings.stream()
				.collect(Collectors.partitioningBy(s-> s.length()%2 == 0));
		for(Entry<Boolean, List<String>> entry: lengthOfString.entrySet()) {
			System.out.println(entry.getKey() + " - > " + entry.getValue());
		}
		
		//using grouping by
		List<String> groupStrings = Arrays.asList("this", "is", "a", "long", "list", "of", "strings", "to", "use", "as", "a", "demo");
		Map<Integer,List<String>> groupingArray=groupStrings.stream()
					.collect(Collectors.groupingBy(String::length));
		
		for(Entry<Integer,List<String>> entry: groupingArray.entrySet()) {
			System.out.print(entry.getKey());
			entry.getValue().forEach(System.out::println);
		}
	}

}
