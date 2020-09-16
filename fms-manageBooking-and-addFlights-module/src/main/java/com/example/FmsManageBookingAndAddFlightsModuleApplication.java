package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repositories.BookingRepository;
import com.example.repositories.UserRepository;

@SpringBootApplication
public class FmsManageBookingAndAddFlightsModuleApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FmsManageBookingAndAddFlightsModuleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//creating user
		
		
		//creating booking
		
		
		//-----Testing ViewAllBooking-----//
		
		
		//-----Testing ViewBookingById-----//
		
	}

	
	

}
