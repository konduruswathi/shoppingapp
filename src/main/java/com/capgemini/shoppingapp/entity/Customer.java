package com.capgemini.shoppingapp.entity;

import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private String customerEmail;
	private long contactNumber;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String customerFirstName, String customerLastName, String customerEmail,
			long contactNumber, String street, String city, String state, String zip, String country) {
		super();
		this.customerId = customerId;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerEmail = customerEmail;
		this.contactNumber = contactNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.country = country;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", customerEmail=" + customerEmail + ", contactNumber=" + contactNumber
				+ ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip + ", country=" + country
				+ "]";
	}

}