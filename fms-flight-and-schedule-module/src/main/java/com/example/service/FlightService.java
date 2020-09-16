package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entities.Flight;


public interface FlightService {

	Flight addFlight(Flight flight);
	Flight modifyFlight(Flight flight);
	Flight viewFlight(Long flightId);
	List<Flight> viewFlight();
	void deleteFlight(Long flightId);
	void validateFlight(Flight flight);
}
