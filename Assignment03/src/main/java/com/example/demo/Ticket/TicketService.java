package com.example.demo.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketService extends JpaRepository<Ticket,Integer>
{

}
