package com.karuna.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="donor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Donor extends BaseEntity {
    
	@Column(name="donor_name",length=100)
	private String name;
	
	@Column(name="phone",length=13)
	private Long phone;
	
	@Column(nullable = false,unique = true)
	private String email;
	
	@Column(nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	@Column(length = 500)
	private String address;
	
	@Column(name="status")
	private Boolean status;
	
	@Column(name="donation_count")
	private Long donationCount; 
	
	@OneToMany(mappedBy = "donor")
	private List<Item> items;
	
	
	
	
	
}
