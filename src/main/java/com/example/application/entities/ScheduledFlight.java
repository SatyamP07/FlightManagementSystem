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
@Table(name = "sheduled_flight")
public class ScheduledFlight {
	@Id
	private Long scheduledFlightId;
	private int availableSeat;
	//mapping
	private int scheduleId;
	private int flightNumber;
}
