package com.udemy.model;

public class ContactModel {
	private String city;
	private String firstName;
	private int id;
	private String lastName;
	private String telephone;

	public ContactModel(int id, String firstName, String lastName, String telephone, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "ContactModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", telephone="
				+ telephone + ", city=" + city + "]";
	}
}
