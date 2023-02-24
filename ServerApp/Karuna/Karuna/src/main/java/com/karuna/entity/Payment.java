package com.karuna.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public class Payment extends BaseEntity {
	
	
	@OneToOne
	@JoinColumn(name="sender_id")
	private Receiver sender;
	
	@Column(name="payment_date_time")
	private LocalDateTime paymentDateTime;

	@Column(length=200)
	private String description;
	
	private Boolean status;
}
