package com.tyss.jpaproj2.bean;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity

@Table(name="movies")
public class Movies1 implements Serializable{


	
	
	@Override
	public String toString() {
		return "Movies1 [id=" + id + ", name=" + name + ", rating=" + rating + ", reviews=" + reviews + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	@Id
	@Column(name="mid")
	private int id;
	
	@Column(name="mname")
	private String name;
	
	@Column(name="ratings")
	private double rating;
	
	@Column(name="reviews")
	private String reviews;
	
	
	}
