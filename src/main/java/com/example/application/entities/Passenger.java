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
@Table(name = "passenger")
public class Passenger {
	@Id
	private Long passengerId;
	private String passengerName;
	private int passengerAge;
	private Long passengerUniqueId;
	private double luggage; 
}
