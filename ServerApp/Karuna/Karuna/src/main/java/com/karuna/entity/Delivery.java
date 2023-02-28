package com.karuna.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Delivery extends BaseEntity {
	
	@Column(name="delivery_date_time")
	private LocalDateTime deliveryDateTime;
	
	@OneToMany
	@JoinColumn(name="item_id")
	private List<Item> items;
	
	@ManyToMany
	@JoinTable(
	name="delivery_donor_handling",joinColumns = @JoinColumn(name="donor_id"),inverseJoinColumns = @JoinColumn(name="staff_id"))
	private List<Donor> donors;

	@ManyToMany
	@JoinTable(
	name="delivery_receiver_handling",joinColumns = @JoinColumn(name="reciever_id"),inverseJoinColumns = @JoinColumn(name="staff_id"))
	private List<Receiver> receivers;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="staff_id")
	private Staff deliveredBy;
	
	private Boolean status;

}
