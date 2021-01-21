package com.example.demo.flight;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FlightController 
{
	@Autowired
	FlightService flightService;
	
	@RequestMapping("/flight")
    public List<Flight> getFlight() 
	{
	  
	 return flightService.findAll(); 
	 }
	
	@GetMapping("/flight/{flightId}")	  
	  public Optional<Flight> getFlight(@PathVariable("flightId") int flightId) 
	  {
	  
	  return flightService.findById(flightId); 
	  }
	
	 @PostMapping("/flight")
	  public Flight addFlight(@RequestBody Flight flight)
	  {
		 flightService.save(flight);
	     	return flight;
	  }
	 
	 @DeleteMapping("/flight/{flightId}")
	  public String deleteFlight(@PathVariable int flightId)
	  {
		  Flight f = flightService.getOne(flightId);
		  
		  flightService.delete(f);
		  
		  return "Flight deleted";
	  }
	
	  @PutMapping("/flight")
	  public Flight saveOrUpdateFlight(@RequestBody Flight flight)
	  {
		  flightService.save(flight);
	  	return flight;
	  }
}
