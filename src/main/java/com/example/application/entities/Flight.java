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
@Table(name = "flight")
public class Flight {
	@Id
	private Long flightNumber;
	private String carrierName;
	private String flightModel;
	private int seatCapacity;
	
}
