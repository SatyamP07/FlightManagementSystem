package com.example.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.application.entities.Flight;
import com.example.application.exceptions.EmptyRepositoryException;
import com.example.application.repositories.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	FlightRepository flightRepository;

	@Override
	public Flight viewFlight(Long flightId) {
		Flight flight = flightRepository.findById(flightId).get();
		return flight;
	}

	@Override
	public List<Flight> viewFlight() throws EmptyRepositoryException {
		List<Flight> flight = flightRepository.findAll();
		if(flight.isEmpty()) {
			throw new com.example.application.exceptions.EmptyRepositoryException("Sorry, There are No schedule Flights.");
		}
		else {
			return flight;
		}
	}
	
	
	
	
	@Override
	public Flight addFlight(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight modifyFlight(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteFlight(Long flightId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validateFlight(Flight flight) {
		// TODO Auto-generated method stub

	}

}