package com.example.Customquery.repositories;

import com.example.Customquery.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    @Query(value = "SELECT * FROM FLIGHT", nativeQuery = true)
    List<Flight> getAllFlights();

}
