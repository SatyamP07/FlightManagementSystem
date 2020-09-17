package com.example.application.service;

import java.time.LocalDate;
import java.util.List;

import com.example.application.entities.Airport;
import com.example.application.entities.Flight;
import com.example.application.entities.Schedule;
import com.example.application.entities.ScheduledFlight;

public class ScheduleFlightServicesImpl implements ScheduledFlightService {

	@Override
	public ScheduledFlight scheduleFlight(ScheduledFlight scheduledFlight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduledFlight> viewScheduledFlights(Airport sourceAirport, Airport destinationAirport,
			LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight viewScheduledFlights(Long scheduledFlightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ScheduledFlight> viewScheduledFlight() {
		// TODO Auto-generated method stub
		return null;
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
