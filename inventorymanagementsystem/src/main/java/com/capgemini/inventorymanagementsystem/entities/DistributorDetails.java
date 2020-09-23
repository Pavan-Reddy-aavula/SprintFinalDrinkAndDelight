package com.capgemini.inventorymanagementsystem.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "distributordetails")
public class DistributorDetails implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence")
	@Column(name ="distributor_id")
	private int distributorId;
	@Column(name = "distributor_name")
	private String distributorName;
	@Column(name = "address")
	private String address;
	@Column(name = "phone_number")
	private long phonenumber;
	@Column(name = "email_id")
	private String emailId;
	
	
	
	

	public DistributorDetails(int distributorId, String distributorName, String address, long phonenumber,
			String emailId) {
		super();
		this.distributorId = distributorId;
		this.distributorName = distributorName;
		this.address = address;
		this.phonenumber = phonenumber;
		this.emailId = emailId;
	}

	public DistributorDetails() {
		// TODO Auto-generated constructor stub
	}

	public int getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}

	public String getDistributorName() {
		return distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


}