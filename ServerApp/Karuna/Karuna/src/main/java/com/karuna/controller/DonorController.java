package com.karuna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karuna.dto.DonorRegisterDto;
import com.karuna.service.DonorServices;

import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/donor")
@CrossOrigin
public class DonorController {
	
	
	@Autowired
	private DonorServices donorServices;
	public DonorController() {
		super();
	}

	
	@PostMapping("/register")
	public DonorRegisterDto registerDonor(@RequestBody DonorRegisterDto donor) {
		return donorServices.registerDonor(donor);
		
	}
	

}
