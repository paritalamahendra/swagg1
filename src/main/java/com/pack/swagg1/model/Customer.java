package com.pack.swagg1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private Integer cusid;
 private String name;
 
 @Temporal(TemporalType.DATE)
 private Date dateofbirth;
 private Integer age;
 
 @ManyToOne
 @JoinColumn(name="bank")
private Bank bank; 
 
}
