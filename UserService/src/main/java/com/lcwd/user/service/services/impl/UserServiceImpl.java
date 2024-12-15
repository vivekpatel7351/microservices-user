package com.lcwd.user.service.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lcwd.user.service.entity.Hotel;
import com.lcwd.user.service.entity.Rating;
import com.lcwd.user.service.entity.User;
import com.lcwd.user.service.exception.ResourceNotFoundException;
import com.lcwd.user.service.external.services.HotelService;
import com.lcwd.user.service.repositorys.UserReposetory;
import com.lcwd.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserReposetory userRepository;

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	HotelService hotelService;

	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);

	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		
		User user = userRepository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User with given id is not found on derver " + userId));
		Rating ratingsOfUser[] = restTemplate.getForObject("http://RATINGSERVICE/ratings/user/" + userId,Rating[].class);
		List<Rating> ratings = Arrays.stream(ratingsOfUser).toList();
		for (Rating rating : ratings) {
		//	 Hotel hotel = restTemplate.getForEntity("http://HOTELSERVICE/hotels/" + rating.getHotelId(), Hotel.class).getBody();
			 Hotel hotel = hotelService.getHotelDetails(rating.getHotelId());
			 rating.setHotel(hotel);
		}
		
		user.setUserRating(ratings);
		return user;
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

}
