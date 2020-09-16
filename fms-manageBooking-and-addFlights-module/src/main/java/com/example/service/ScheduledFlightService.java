package com.example.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Airport;
import com.example.entities.Flight;
import com.example.entities.Schedule;
import com.example.entities.ScheduledFlight;

@Service
public interface ScheduledFlightService {

	ScheduledFlight scheduleFlight(ScheduledFlight scheduledFlight);
	List<ScheduledFlight> viewScheduledFlights(Airport sourceAirport, Airport destinationAirport, LocalDate date);
	Flight viewScheduledFlights(Long scheduledFlightId);
	List<ScheduledFlight> viewScheduledFlight();
	ScheduledFlight modifyScheduledFlight(Flight flight,Schedule schedule, Integer integer);
	void deleteScheduledFlight(Long scheduledFlightId);
	void validateScheduledFlight(ScheduledFlight scheduledFlight);
}
