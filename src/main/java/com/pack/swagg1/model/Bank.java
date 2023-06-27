package com.pack.swagg1.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Bank {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bankno;
	private String bankname;
	
	@JsonIgnore
	@OneToMany
	private List<Customer> customers= new ArrayList<>();

	public Integer getBankno() {
		return bankno;
	}

	public void setBankno(Integer bankno) {
		this.bankno = bankno;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Bank(Integer bankno, String bankname) {
		super();
		this.bankno = bankno;
		this.bankname = bankname;
	
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

