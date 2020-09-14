package com.example.application.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.DateTimeAtCompleted;

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
@Table(name = "sheduled")
public class Schedule {

	@Id
	private Long scheduleId;
	private Date arrivalTime;
	private Date departureTime;
	
	//mapping
	private String sourceAirportCode;
	private String destinationAirportCode;
}
