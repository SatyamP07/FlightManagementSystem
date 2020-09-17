package com.example.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entities.Flight;
import com.example.application.exceptions.EmptyRepositoryException;

public interface FlightService {

	Flight addFlight(Flight flight);
	Flight modifyFlight(Flight flight);
	Flight viewFlight(Long flightId);
	List<Flight> viewFlight() throws EmptyRepositoryException;
	void deleteFlight(Long flightId);
	void validateFlight(Flight flight);
}

