package com.lcwd.rating.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.rating.entites.Rating;

public interface RatingRepository extends JpaRepository<Rating, String> {
	
	public List<Rating> findByUserId(String userId);
	
	public List<Rating> findByHotelId(String userId);

}
