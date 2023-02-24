package com.karuna.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="item")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Item extends BaseEntity {
    
	@Column(name="item_category")
	private Category itemCategory;
	
	@OneToOne
	@JoinColumn(name="receiver_id")
	private Receiver receiverId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "donor_id",insertable = false, updatable = false)
	private Donor donor;
	
	@Column(name="listed_date_time")
	private LocalDateTime listedDateTime;
	
	private Long quantity;
	
	private Boolean status;	
	
	
	@Column(name="accepted_date_time")
	private LocalDateTime acceptedDateTime;
	
	@ManyToOne(fetch=FetchType.LAZY)
	private Delivery delivery;
	
	
	
	
}
