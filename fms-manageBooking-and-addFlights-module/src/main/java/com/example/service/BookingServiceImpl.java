package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Booking;
import com.example.entities.Passenger;
import com.example.exceptions.BookingException;
import com.example.repositories.BookingRepository;
import com.example.repositories.UserRepository;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository bookingRepository;
	
	@Override
	public Booking addBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking modifyBooking(Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking viewBooking(Long bookingId) {
		Optional<Booking> bookingOptional = bookingRepository.findById(bookingId);
		
		if(bookingOptional.isPresent()) {
			Booking bookingTicket = bookingOptional.get();
			System.out.println(bookingTicket);
			return bookingTicket;
		}
		else {
			throw new BookingException("Wrong Booking ID is entered!");
		}
	}

	@Override
	public List<Booking> viewAllBooking() {
//		List<Booking> bookingList = bookingRepository.findByUserId(userId);
//		
//		if(bookingList.isEmpty()) {
//			throw new BookingException("User has no bookings!");
//		} 
//		else {
//			for(Booking bookings: bookingList) {
//				System.out.println(bookings);
//			}
//			return bookingList;
//		}
		return bookingRepository.findAll();
	}

	@Override
	public void deleteBooking(Long bookingId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validateBooking(Booking booking) {
		// TODO Auto-generated method stub

	}

	@Override
	public void validatePassanger(Passenger passenger) {
		// TODO Auto-generated method stub

	}

}
