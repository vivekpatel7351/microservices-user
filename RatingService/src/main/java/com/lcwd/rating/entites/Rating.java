package com.lcwd.rating.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ratings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {
	
	@Id
	@Column(name = "RATING_ID")
	private String ratingId;
	
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "HOTEL_ID")
	private String hotelId;
	
	@Column(name = "RATING")
	private int rating;
	
	@Column(name = "FEEDBACK")
	private String feedBack;

}
