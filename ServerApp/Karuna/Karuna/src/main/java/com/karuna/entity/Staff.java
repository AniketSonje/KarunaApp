package com.karuna.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

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
public class Staff extends BaseEntity {
	
	@Column(name="staff_name",length=100)
	private String name;
	
	@Column(nullable = false,unique = true)
	private String email;
	
	@Column(nullable = false)
	@JsonProperty(access = Access.WRITE_ONLY)
	private String password;
	
	@Column(length = 500)
	private String address;
	
	@Column(name="phone",length=13)
	private Long phone; 
	
	@ManyToMany(mappedBy = "staffs")
	private List<Request> requests;
	
	@Column(name="staff_role")
	private Role staffRole;
	
	private Boolean status;
	
	@OneToMany(mappedBy = "deliveredBy")
	private List<Delivery> delivery;
	

}
