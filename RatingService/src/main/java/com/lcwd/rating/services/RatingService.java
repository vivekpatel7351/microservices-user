package com.lcwd.rating.services;

import java.util.List;

import com.lcwd.rating.entites.Rating;

public interface RatingService {
	
	//creating rating
	public Rating saveRating(Rating rating);
	
	//get rating by rating id
	public Rating getRating(String ratingId);
	
	//get all rating
	public List<Rating> getAllRating();
	
	//get rating by hotel id
	public List<Rating> getRatingByHotelId(String hotelId);
	
	//get rating by user id
	public List<Rating> getRatingByUserId(String userId);

}
