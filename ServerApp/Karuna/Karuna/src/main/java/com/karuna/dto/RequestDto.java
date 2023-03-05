package com.karuna.dto;

import com.karuna.entity.BaseEntity;

public class RequestDto extends BaseEntity{
	
    private String description;
	
	
	private String status;


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public RequestDto(Long id, String description, String status) {
		super(id);
		this.description = description;
		this.status = status;
	}


	public RequestDto() {
		super();
	}


	@Override
	public String toString() {
		return "RequestDto [description=" + description + ", status=" + status + "]";
	}
	
	
	

}
