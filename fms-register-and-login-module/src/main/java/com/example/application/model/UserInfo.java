package com.example.application.model;

import com.example.application.entities.User;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class UserInfo {
	private Long userId;
	private String userName;
	private long phoneNumber;
	private String email;
	
	public UserInfo(User user) {
		this.userId = user.getUserId();
		this.userName = user.getUserName();
		this.phoneNumber = user.getPhoneNumber();
		this.email = user.getEmail(); 
	}
}
