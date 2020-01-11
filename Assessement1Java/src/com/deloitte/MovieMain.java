package com.deloitte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		int id;
		String name, showdate, showtime, status;
		
		List<Movie> movieList = new ArrayList<>();
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no. of movies you want to enter the details about");
		int numberOfMovies = scan.nextInt();
		System.out.println("Please enter the following details about the movie");
		System.out.println("ID, Name, Showdate, Showtime, Status");

		for (int i = 0; i < numberOfMovies; i++) {
			
			id = scan.nextInt();
			name = scan.next();
			showdate = scan.next();
			showtime = scan.next();
			status = scan.next();
			
			movieList.add(new Movie(id, name, showdate, showtime, status));

		}
		System.out.println("Enter id of movie to get details about it");
		int searchId = scan.nextInt();
		Movie element = movieList.get(--searchId); 
		System.out.println(element);
	}

}
