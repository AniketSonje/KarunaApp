package com.karuna.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Request extends BaseEntity {
	
	@Column(length=200)
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "receiver_id",insertable = false, updatable = false)
	private Receiver receiver;
	
	@ManyToMany
	@JoinTable(
	name="reuest_handling",joinColumns = @JoinColumn(name="request_id"),inverseJoinColumns = @JoinColumn(name="satff_id"))
	private List<Staff> staffs;
	
	private Boolean status;
	
	
	
	

}
