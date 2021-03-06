package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.ScheduledFlight;

@Repository
public interface ScheduledFlightRepository extends JpaRepository<ScheduledFlight, Long> {

}
