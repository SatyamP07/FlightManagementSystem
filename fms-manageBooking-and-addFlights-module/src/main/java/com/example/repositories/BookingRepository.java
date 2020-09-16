package com.example.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

	public List<Booking> findByUserId(Long userId);
}
