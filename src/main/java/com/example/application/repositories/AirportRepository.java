package com.example.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.application.entities.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String> {

}
