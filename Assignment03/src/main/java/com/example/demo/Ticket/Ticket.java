package com.example.demo.Ticket;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ticket 
{
   @Id
   int ticketId;
   int passengerId;
   int flightId;
   String departureDate;
   double amountPaid;
   String status;
public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getPassengerId() {
	return passengerId;
}
public void setPassengerId(int passengerId) {
	this.passengerId = passengerId;
}
public int getFlightId() {
	return flightId;
}
public void setFlightId(int flightId) {
	this.flightId = flightId;
}
public String getDepartureDate() {
	return departureDate;
}
public void setDepartureDate(String departureDate) {
	this.departureDate = departureDate;
}
public double getAmountPaid() {
	return amountPaid;
}
public void setAmountPaid(double amountPaid) {
	this.amountPaid = amountPaid;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
   
}
