package com.example.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
