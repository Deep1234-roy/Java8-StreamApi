package com.training;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.training.model.Movie;

public class CreatingStreams {

	//From Collection
	private void collectionStream() {
		List<Movie> movieStreamList = Movie.createMovie();
		movieStreamList.stream().forEach(System.out::println);
	}
	
	//Empty Stream
	private void testEmptyStreams() {
		Stream<Movie> movieEmptyStream = Stream.empty();
		System.out.println("Empty Stream = " + movieEmptyStream.count());
	}
	
	//From Values/arrays
	private void testStreamForValues() {
		Stream<String> movieNames = Stream.of("God Must be Crazy","Fiddler on the Roof");
		System.out.println("Number of Movies = " + movieNames.count());
		
		//Another way - as an array
		String[] movieNameArray = {"God Must be Crazy","Fiddler on the Roof"};
		Stream<String> movieNamesFromArray = Arrays.stream(movieNameArray);
		System.out.println("Number of Movies = " + movieNamesFromArray.count());
		
	
	}
	
	//Generate Infinite Stream
		private void GenerateInfiniteStream() {
			Stream<Double> randomNumbers = Stream.generate(Math::random);
			randomNumbers.forEach(System.out::println);
		}
	
	public static void main(String[] args) {
		System.out.println("\n Collections Stream");
		System.out.println("======================");
		new CreatingStreams().collectionStream();
		System.out.println("\n Empty Stream");
		System.out.println("======================");
		new CreatingStreams().testEmptyStreams();
		System.out.println("\n Values/Array Stream");
		System.out.println("======================");
		new CreatingStreams().testStreamForValues();
		System.out.println("\n Infinite Stream");
		System.out.println("======================");
		new CreatingStreams().GenerateInfiniteStream();
	}

}
