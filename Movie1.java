package com.Challenge;

public class Movie1 {
	String movieName;
	String actorName;
	String actressName;
	String director;
	String viewersRating;

	public void showMovieDetails() {

		System.out.println("---------Movie Details----------");
		System.out.println("Name of the Movie : " + movieName);
		System.out.println("Name of the Actor : " + actorName);
		System.out.println("Name of the Actress : " + actressName);
		System.out.println("Directed by : " + director);
		System.out.println("Rating given by the viewers : " + viewersRating);
	}

	Movie1(String movieName, String actorName, String actressName, String director, String viewersRating) {
		this.movieName = movieName;
		this.actorName = actorName;
		this.actressName = actressName;
		this.director = director;
		this.viewersRating = viewersRating;
	}

	public static void main(String[] args) {
		Movie1 movieDetails1 = new Movie1("Maaran", "Dhanush", "Malavika Mohan", "Karthick Naren", "4/5");
		Movie1 movieDetails2 = new Movie1("Titanic", "Leonardo Dicaprio", "Kate Winslet", "James Camern", "7.9/10");
		movieDetails1.showMovieDetails();
		System.out.println();
		movieDetails2.showMovieDetails();
	}
}
