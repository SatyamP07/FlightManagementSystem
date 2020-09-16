package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Booking;
import com.example.service.BookingService;

@RestController
@RequestMapping("/booking")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@GetMapping("/viewAllBooking/{userid}")
	public List<Booking> displayAllBookings(@PathVariable Long userid) {
		return bookingService.viewAllBooking(userid);
	}
}
