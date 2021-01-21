package com.example.demo.flight;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightService extends JpaRepository<Flight,Integer>
{

}
