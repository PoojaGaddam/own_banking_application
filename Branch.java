package com.example.bank.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="branch")
public class Branch implements Serializable{
	
	private static final long serialVersionUID = 3201214327244416328L;

	public static final String bankName = "MY BANK";

	@Id
	@Column(name="branch_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int branchID;
	
	@Column(name="branch_name")
	private String branchName;

	@Column(name="branch_ifsc")
	private String branchIfsc;

	@Column(name="contact_number")
	private Long contactNumber;

	@JoinColumn(name="address")
	@OneToOne
	private Address address;
	

	public int getBranchID() {
		return branchID;
	}

	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getbranchIfsc() {
		return branchIfsc;
	}

	public void setbranchIfsc(String branchIfsc) {
		this.branchIfsc = branchIfsc;
	}
}
