package com.org.controller;

import java.math.BigInteger;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.exceptions.RecordNotFoundException;
import com.org.exceptions.ScheduledFlightNotFoundException;
import com.org.model.Airport;
import com.org.model.Schedule;
import com.org.model.ScheduledFlight;
import com.org.service.AirportService;
import com.org.service.FlightService;
import com.org.service.ScheduledFlightService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/scheduledFlight")
public class ScheduledFlightController {
	
	@Autowired
	ScheduledFlightService scheduleFlightService;

	@Autowired
	AirportService airportService;

	@Autowired
	FlightService flightService;

	@PostMapping("/add")
	public ResponseEntity<ScheduledFlight> addSF(@ModelAttribute ScheduledFlight scheduledFlight,
			@RequestParam(name = "srcAirport") String source, @RequestParam(name = "dstnAirport") String destination,
			@RequestParam(name = "deptDateTime") String departureTime, @RequestParam(name = "arrDateTime") String arrivalTime) {
		Schedule schedule = new Schedule();
		schedule.setScheduleId(scheduledFlight.getScheduleFlightId());
		try {
			schedule.setSrcAirport(airportService.viewAirport(source));
		} catch (RecordNotFoundException e) {
			return new ResponseEntity("Airport Not Found", HttpStatus.BAD_REQUEST);
		}
		try {
			schedule.setDstnAirport(airportService.viewAirport(destination));
		} catch (RecordNotFoundException e) {
			return new ResponseEntity("Airport Not Found", HttpStatus.BAD_REQUEST);
		}
		schedule.setDeptDateTime(departureTime);
		schedule.setArrDateTime(arrivalTime);
		try {
			scheduledFlight.setFlight(flightService.viewFlight(scheduledFlight.getScheduleFlightId()));
		} catch (RecordNotFoundException e1) {
			return new ResponseEntity("Flight Not Found", HttpStatus.BAD_REQUEST);
		}
		scheduledFlight.setSchedule(schedule);
		scheduledFlight.setAvailableSeats(scheduledFlight.getFlight().getSeatCapacity());
		try {
			return new ResponseEntity<ScheduledFlight>(scheduleFlightService.addScheduledFlight(scheduledFlight),
					HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity("Error adding Flight." + e, HttpStatus.BAD_REQUEST);
		}
	}


}
