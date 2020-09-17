package com.example.application.controller;

import java.util.List;

import javax.mail.MessagingException;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.entities.Flight;
import com.example.application.entities.User;
import com.example.application.exceptions.EmptyRepositoryException;
import com.example.application.exceptions.UserAlreadyExistsException;
import com.example.application.service.FlightService;
import com.example.application.service.UserService;

@RestController
@RequestMapping(value="/bootcamp/user",method= {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT})
public class RestApiController {
	
	org.slf4j.Logger logger = LoggerFactory.getLogger(RestApiController.class);	
	
	@Autowired
    UserService userService;
	
	@Autowired
	FlightService flightService;
	
	@PostMapping("/registerUser")
    public ResponseEntity<?> registerUser(@RequestBody User user) throws MessagingException, UserAlreadyExistsException
    {
		logger.trace("Add user working...");
     
			userService.addUser(user);
            return ResponseEntity.ok(HttpStatus.OK);
    }
	
	@GetMapping("/viewFlight/{flightNumber}")
	public ResponseEntity<Flight> viewFlight(@PathVariable("flightNumber") Long flightId){
		Flight flight = flightService.viewFlight(flightId);
		return new ResponseEntity<Flight>(flight, HttpStatus.OK);
	}
	
	@GetMapping("/viewAllFlights")
	 public ResponseEntity<List<Flight>> viewAllFlights() throws EmptyRepositoryException{
		List<Flight> flights= flightService.viewFlight();
			return new ResponseEntity<List<Flight>>(flights, HttpStatus.OK);		
		}
	
}
