package com.movies;

public class Movie {
	
	int movie_id;
	String movie_name;
	double price;
	String producer_name;
	String release_date;
	
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getProducer_name() {
		return producer_name;
	}
	public void setProducer_name(String producer_name) {
		this.producer_name = producer_name;
	}
	public String getRelease_date() {
		return release_date;
	}
	public void setRelease_date(String release_date) {
		this.release_date = release_date;
	}
	
	
	public void display()
	{
		System.out.println(" Movie_ID:"+movie_id+" Movie_name:"+movie_name+ " Ticket:"+price+
				" producer name:"+producer_name+" Release_Date:"+release_date);
	}

}
