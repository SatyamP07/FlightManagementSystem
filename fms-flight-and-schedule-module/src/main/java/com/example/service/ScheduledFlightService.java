package com.example.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entities.Airport;
import com.example.application.entities.Flight;
import com.example.application.entities.Schedule;
import com.example.application.entities.ScheduledFlight;

public interface ScheduledFlightService {

	ScheduledFlight scheduleFlight(ScheduledFlight scheduledFlight);
	List<ScheduledFlight> viewScheduledFlights(Airport sourceAirport, Airport destinationAirport, LocalDate date);
	Flight viewScheduledFlights(Long scheduledFlightId);
	List<ScheduledFlight> viewScheduledFlight();
	ScheduledFlight modifyScheduledFlight(Flight flight,Schedule schedule, Integer integer);
	void deleteScheduledFlight(Long scheduledFlightId);
	void validateScheduledFlight(ScheduledFlight scheduledFlight);
}
