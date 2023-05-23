package com.training.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private int movieId;
	private String movieName;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	@Override
	public String toString() {
		return "[" + movieId + " " + movieName + "]";
	}
	
	public static List<Movie> createMovie() {
		List<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie(1, "God Must Be Crazy"));
		movieList.add(new Movie(2, "Best in Show"));
		movieList.add(new Movie(3, "Step Brothers"));
		movieList.add(new Movie(4, "Death at a Funeral"));
		movieList.add(new Movie(5, "Jurassic Park"));
		movieList.add(new Movie(6, "Titanic"));
		return movieList;
	}
	public Movie(int movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
