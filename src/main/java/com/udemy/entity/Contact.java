package com.udemy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")
public class Contact {

	@Column(name = "city")
	private String city;

	@Column(name = "firstName")
	private String firstName;
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "telephone")
	private String telephone;

	public Contact() {
	}

	public Contact(int id, String city, String firstName, String lastName, String telephone) {
		super();
		this.id = id;
		this.city = city;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
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
		return "Contact [id=" + id + ", city=" + city + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", telephone=" + telephone + "]";
	}

}
