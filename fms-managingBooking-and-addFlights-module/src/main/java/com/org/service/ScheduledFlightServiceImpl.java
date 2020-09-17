package com.org.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.org.model.Schedule;
import com.org.model.Booking;
import com.org.dao.ScheduleDao;
import com.org.dao.ScheduledFlightDao;
import com.org.exceptions.RecordNotFoundException;
import com.org.exceptions.ScheduledFlightNotFoundException;
import com.org.model.ScheduledFlight;

@Service
public class ScheduledFlightServiceImpl implements ScheduledFlightService {

	@Autowired
	ScheduledFlightDao dao;

	@Autowired
	ScheduleDao scheduleDao;

	@Autowired
	BookingService bookingService;

	@Override
	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight) {
		return dao.save(scheduledFlight);
	}

	@Override
	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduleFlight) {
		return null;
	}

	@Override
	public String removeScheduledFlight(BigInteger flightId) throws RecordNotFoundException {
		return null;
	}

	@Override
	public Iterable<ScheduledFlight> viewAllScheduledFlights() {
		return null;
	}

	@Override
	public ScheduledFlight viewScheduledFlight(BigInteger flightId) throws ScheduledFlightNotFoundException {
		return null;
	}

}
