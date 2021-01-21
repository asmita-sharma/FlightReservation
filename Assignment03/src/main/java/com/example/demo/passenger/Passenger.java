package com.example.demo.passenger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Passenger 
{
	@Override
	public String toString() {
		return "Passenger ID = " + passengerId + ", First Name = " + firstName + ", Last Name = " + lastName
				+ ", Address = " + address + ", City = " + city + ", Country = " + country + ", Telephone = " + telephone
				+ ", Email = " + email + "";
	}
	@Id
	int passengerId;
	String firstName;
	String lastName;
	String address;
	String city;
	String country;
	String telephone;
	String email;

	
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
