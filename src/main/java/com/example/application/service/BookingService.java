package com.example.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.application.entities.Booking;
import com.example.application.entities.Passenger;

@Service
public interface BookingService {
	
	Booking addBooking(Booking booking);
	Booking modifyBooking(Booking booking);
	List<Booking> viewBooking(Long bookingId);
	List<Booking> viewBooking();
	void deleteBooking(Long bookingId);
	void validateBooking(Booking booking);
	void validatePassanger(Passenger passenger);
	
}
