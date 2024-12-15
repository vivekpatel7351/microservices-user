package com.lcwd.user.service.payLoad;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiReposetory {
	
	private String message;
	private boolean success;
	private HttpStatus status;
	

}
