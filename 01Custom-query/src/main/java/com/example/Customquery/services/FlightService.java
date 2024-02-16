package com.example.Customquery.services;

import com.example.Customquery.entities.Flight;
import com.example.Customquery.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAll() {
        return flightRepository.getAllFlights();
    }
}
