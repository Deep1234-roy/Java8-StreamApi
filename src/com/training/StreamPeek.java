package com.training;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("bus","car","bicycle","flight","train")
			.filter(e -> e.length()>3)
			.peek(e -> System.out.println("Filtered Value = " + e))
			.map(String::toUpperCase)
			.peek(e -> System.out.println("Mapped Value = " + e))
			.collect(Collectors.toList());
			
			

	}

}
