package com.karuna.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Request")
public class Request extends BaseEntity 
{
	
	
	private String description;
	
	
	private String status;
	
	@Enumerated(EnumType.STRING)
	private Type type;
	
	
	@ManyToOne
	@JoinColumn(name="receiver_id")
	private Receiver receiver;
	
	@ManyToMany
	@JoinTable(
			  name = "reques_handling", 
			  joinColumns = @JoinColumn(name = "staff_id"), 
			  inverseJoinColumns = @JoinColumn(name = "request_id"))
	private List<Staff> staffs=new ArrayList<Staff>();
}
