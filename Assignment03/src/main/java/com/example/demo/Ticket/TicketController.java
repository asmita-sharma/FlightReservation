package com.example.demo.Ticket;

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
public class TicketController 
{
	@Autowired
	TicketService ticketService;
	
	@RequestMapping("/ticket")
    public List<Ticket> getTicket() 
	{
	  
	 return ticketService.findAll(); 
	 }
	
	@GetMapping("/ticket/{ticketId}")	  
	  public Optional<Ticket> getTicket(@PathVariable("ticketId") int ticketId) 
	  {
	  
	  return ticketService.findById(ticketId); 
	  }
	
	 @PostMapping("/ticket")
	  public Ticket addTicket(@RequestBody Ticket ticket)
	  {
		 ticketService.save(ticket);
	     	return ticket;
	  }
	 
	 @DeleteMapping("/ticket/{ticketId}")
	  public String deleteTicket(@PathVariable int ticketId)
	  {
		  Ticket t = ticketService.getOne(ticketId);
		  
		  ticketService.delete(t);
		  
		  return "Ticket deleted";
	  }
	
	  @PutMapping("/ticket")
	  public Ticket saveOrUpdateTicket(@RequestBody Ticket ticket)
	  {
		  ticketService.save(ticket);
	  	return ticket;
	  }
}
