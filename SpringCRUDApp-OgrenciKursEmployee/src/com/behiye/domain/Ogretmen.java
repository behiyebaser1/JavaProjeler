package com.behiye.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OGRETMEN")
public class Ogretmen {

	@Id
	@Column(name = "id")
	private Integer ogretmenId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "ogretmen_detay_id")
	private Integer ogretmenDetayId;

	public Integer getOgretmenId() {
		return ogretmenId;
	}

	public void setOgretmenId(Integer ogretmenId) {
		this.ogretmenId = ogretmenId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getOgretmenDetayId() {
		return ogretmenDetayId;
	}

	public void setOgretmenDetayId(Integer ogretmenDetayId) {
		this.ogretmenDetayId = ogretmenDetayId;
	}

	public Ogretmen() {
		super();
	}

	@Override
	public String toString() {
		return "Ogretmen [firstName=" + firstName + "]";
	}

}
