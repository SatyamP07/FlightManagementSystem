package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.Booking;
import com.example.entities.Passenger;

@Service
public interface BookingService {
	
	Booking addBooking(Booking booking);
	Booking modifyBooking(Booking booking);
	Booking viewBooking(Long bookingId);				//changing return type
	List<Booking> viewAllBooking(Long userid);			//changing method name and added parameter
	void deleteBooking(Long bookingId);
	void validateBooking(Booking booking);
	void validatePassanger(Passenger passenger);
	
}
