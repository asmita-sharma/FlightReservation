package com.example.demo.passenger;

import java.util.ArrayList;
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
import org.springframework.web.servlet.ModelAndView;


@RestController
public class PassengerController 
{

	@Autowired
	PassengerService pasService;

	/*
	 * @RequestMapping("/") public ModelAndView home() { return new ModelAndView
	 * ("show.jsp"); }
	 */
	
	/*
	 * @RequestMapping("/")
	 * 
	 * @ResponseBody public String getPassengers() {
	 * 
	 * return pasService.findAll().toString(); }
	 */
	
	@GetMapping("/")
	public ModelAndView all()
	{
		List pass = new ArrayList();
		pass = pasService.findAll();	
		return new ModelAndView("show.jsp","pass", pass);		
	}
	
	@RequestMapping("/passenger")
	public List<Passenger> getPassenger() 
	{

		return pasService.findAll(); 
	}

	@GetMapping("/passenger/{passId}")	  
	public Optional<Passenger> getPassenger(@PathVariable("passId") int passId) 
	{

		return pasService.findById(passId); 
	}

	@PostMapping("/passenger")
	public Passenger addPassenger(@RequestBody Passenger passenger)
	{
		pasService.save(passenger);
		return passenger;
	}

	@DeleteMapping("/passenger/{passId}")
	public String deletePassenger(@PathVariable int passId)
	{
		Passenger p = pasService.getOne(passId);

		pasService.delete(p);

		return "deleted";
	}

	@PutMapping("/passenger")
	public Passenger saveOrUpdatePassenger(@RequestBody Passenger passenger)
	{
		pasService.save(passenger);
		return passenger;
	}
}
