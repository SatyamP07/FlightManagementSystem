package com.example.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entities.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

	@Query(
			value = "SELect * FROM BOOKING b WHERE b.user_id = 1",
			nativeQuery = true
			)
	List<Booking> findByUserId(Long user_id);
}
