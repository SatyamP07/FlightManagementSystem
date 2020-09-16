package com.example.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Airport;
import com.example.entities.Flight;
import com.example.entities.Schedule;
import com.example.entities.ScheduledFlight;
import com.example.repositories.ScheduledFlightRepository;

@Service
public class ScheduleFlightServicesImpl implements ScheduledFlightService {

	
	@Autowired
	ScheduledFlightRepository scheduledFlightRepository;
	
	@Override
	public ScheduledFlight scheduleFlight(ScheduledFlight scheduledFlight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduledFlight> viewScheduledFlights(Airport sourceAirport, Airport destinationAirport,
			LocalDate date) {
		// TODO Auto-generated method stub
		List<ScheduledFlight> scheduledFlights = scheduledFlightRepository.findAll();
		for(ScheduledFlight scheduledFlight:scheduledFlights) {
			scheduledFlight.getSchedule().getSourceAirport();
		}
		return null;
	}
	
	@Override
	public Flight viewScheduledFlights(Long scheduledFlightId) {
		ScheduledFlight scheduledFlight = scheduledFlightRepository.findById(scheduledFlightId).get();
		Flight flight = scheduledFlight.getFlight();
		return flight;
	}
	
	// The below function return all the scheduled flight.
	@Override
	public List<ScheduledFlight> viewScheduledFlight() {
		List<ScheduledFlight> scheduledFlights = scheduledFlightRepository.findAll();
		return scheduledFlights;
	}

	@Override
	public ScheduledFlight modifyScheduledFlight(Flight flight, Schedule schedule, Integer integer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteScheduledFlight(Long scheduledFlightId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validateScheduledFlight(ScheduledFlight scheduledFlight) {
		// TODO Auto-generated method stub

	}

}
