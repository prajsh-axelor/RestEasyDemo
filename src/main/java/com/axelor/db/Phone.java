package com.axelor.db;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="phone")
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "phone_type")
	private String phoneType;
	
	@Column(name = "phone_no")
	private String phoneNo;
	
	@ManyToOne
	@JoinColumn(name = "instructor_id")
	private Contact contact;

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Phone(String phoneType, String phoneNo) {
		super();
		this.phoneType = phoneType;
		this.phoneNo = phoneNo;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneType=" + phoneType + ", phoneNo=" + phoneNo + ", contact=" + contact + "]";
	}

	
	
	
	
	
	
	
}