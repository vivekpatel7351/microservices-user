package com.lcwd.hotel.services;

import java.util.List;

import com.lcwd.hotel.entites.Hotel;

public interface HotelService {
	
	// create hotel
	Hotel createHotel(Hotel hotel);
	
	//get hotel by id
	Hotel getHotel(String hotelId);
	
	// get all hotel
	List<Hotel> getAllHotel();

}
