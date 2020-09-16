package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
