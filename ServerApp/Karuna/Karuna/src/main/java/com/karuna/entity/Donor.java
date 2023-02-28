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
@Table(name="donor")
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
	
	@ManyToMany(mappedBy = "donors")
	private List<Delivery> delivery;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getDonationCount() {
		return donationCount;
	}

	public void setDonationCount(Long donationCount) {
		this.donationCount = donationCount;
	}

	


	public Donor(String name, Long phone, String email, String password, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.address = address;
	}



	public Donor() {
		super();
	}

	@Override
	public String toString() {
		return "Donor [name=" + name + ", phone=" + phone + ", email=" + email + ", password=" + password + ", address="
				+ address + "]";
	}

	
	
	
	
	
	
	
}
