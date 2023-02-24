package com.karuna.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Campaign extends BaseEntity {
	
	@Column(name="campaign_name",length=100,nullable=false)
	private String name;
	
	@Column(length=500,nullable=false)
	private String description;

	@Column(name="campaign_date_time")
	private LocalDateTime campaignDateTime;
	
	private Boolean status;
}
