package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entities.Airport;

public interface AirportService {
	List<Airport> viewAirport();
	Airport viewAirport(String airportCode);
}
