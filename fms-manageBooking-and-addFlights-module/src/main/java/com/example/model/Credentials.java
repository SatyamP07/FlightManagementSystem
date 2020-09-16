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
public class Credentials {
	private Long userId;
	private String userType;
	private String password;
}
