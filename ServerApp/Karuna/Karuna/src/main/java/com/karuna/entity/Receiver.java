package com.karuna.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
public class Receiver extends BaseEntity {
	
	@Column(name="receiver_name",length=100)
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
	
	private Long receivedCount;
	
	private Boolean status;
	
	@OneToOne(mappedBy = "receiverId")
	private Item item;
	
	@OneToOne(mappedBy = "sender")
	private Payment payment;
	
	@ManyToMany
	private List<Delivery> deliveryId;
	
	

}
