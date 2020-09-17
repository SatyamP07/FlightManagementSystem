package com.org.service;

import com.org.exceptions.*;
import java.math.BigInteger;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.org.dao.FlightDao;
import com.org.exceptions.RecordAlreadyPresentException;
import com.org.model.Flight;

@Service
public class FlightServiceImpl implements FlightService {
	@Autowired
	FlightDao flightDao;

	@Override
	public ResponseEntity<Flight> addFlight(Flight flight) {
		Optional<Flight> findById = flightDao.findById(flight.getFlightNo());
		try {
			if (!findById.isPresent()) {
				flightDao.save(flight);
				return new ResponseEntity<Flight>(flight,HttpStatus.OK);
			} else
				throw new RecordAlreadyPresentException("Flight with number: " + flight.getFlightNo() + " already present");
		}
		catch(RecordAlreadyPresentException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public Iterable<Flight> viewAllFlight() {
		return null;
	}

	@Override
	public Flight viewFlight(BigInteger flightNumber) {
		return null;
	}
		
	@Override
	public Flight modifyFlight(Flight flight) {
		return null;
	}

	public String removeFlight(BigInteger flightNumber) {
		return null;
	}
}
