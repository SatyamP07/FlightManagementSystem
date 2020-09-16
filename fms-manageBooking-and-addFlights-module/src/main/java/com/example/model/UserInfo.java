package com.example.model;

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
	private long phoneNumber;
	private String email;
}
