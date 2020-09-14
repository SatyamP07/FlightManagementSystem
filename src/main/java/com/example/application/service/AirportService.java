package com.example.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entities.Airport;

@Service
public interface AirportService {
	List<Airport> viewAirport();
	Airport viewAirport(String airportCode);
}
