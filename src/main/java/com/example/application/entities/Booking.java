package com.example.application.entities;

import java.sql.Date;
import java.util.List;

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
@Table(name = "booking")
public class Booking {
	@Id
	private Long bookingId;
	private Date bookingDate;
	private double tickectCost;
	private int numberOfPassengers;
	
	//mapping
	private int userId;
	private List<Passenger> passengerList;
	private int flightId;
}
