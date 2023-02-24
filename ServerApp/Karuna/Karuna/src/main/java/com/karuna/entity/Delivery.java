package com.karuna.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
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

}
