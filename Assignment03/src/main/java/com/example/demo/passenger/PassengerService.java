package com.example.demo.passenger;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerService extends JpaRepository<Passenger,Integer>
{

}
