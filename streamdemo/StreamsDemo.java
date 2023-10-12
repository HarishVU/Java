package com.streamdemo;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {
	public static void main(String[] args) {
		
		List<Movie> movies = Arrays.asList((new Movie("m1",2020,"ac")),(new Movie("m2",2021,"ab")));
//		Stream<Movie> movieStream = movies.stream();
//		Stream<Movie> filterStream = movieStream.filter(m -> m.getReleaseYear() == 2020);
//		Stream<Object> mapStream = filterStream.map(m -> m.getName());
//		mapStream.sorted();
		
		movies.stream()
			.filter(m -> m.getReleaseYear() == 2020)
			.map(m -> m.getName())
			.forEach((System.out::print));
	}
}
