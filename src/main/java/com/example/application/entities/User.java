package com.example.application.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

@Entity
@Table(name = "user")
public class User {

	@Id
	private Long userid;
	private String userType;
	private String username;
	private String password;
	private Long phoneNumber;
	private String email;
}
