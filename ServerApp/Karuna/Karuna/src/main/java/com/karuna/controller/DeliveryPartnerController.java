package com.karuna.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karuna.dto.LoginDto;
import com.karuna.entity.Donor;
import com.karuna.entity.Receiver;
import com.karuna.entity.Request;
import com.karuna.entity.Staff;
import com.karuna.services.DeliveryPartnerService;

@RestController
@CrossOrigin
@RequestMapping("/delivery_partner")
public class DeliveryPartnerController {
	
    @Autowired
    private DeliveryPartnerService delService;
    
    @PostMapping("/login")
   	public ResponseEntity<?> validateDonor(@RequestBody LoginDto loginDto){
       	return ResponseEntity.ok(delService.login(loginDto));
       }  
    
	@GetMapping("/request")
	public ResponseEntity<?> viewRequest(){
		return ResponseEntity.ok(delService.viewRequests());
	}
	
	@GetMapping("/donor_location")
	public ResponseEntity<?> viewDonorLocation(@PathVariable Donor donor){
		return ResponseEntity.ok(delService.viewLocationOfDonor(donor));
	}
	
	@GetMapping("/receiver_location")
	public ResponseEntity<?> viewReceiverLocation(@PathVariable Receiver receiver){
		return ResponseEntity.ok(delService.viewLocationOfReceiver(receiver));
	}
	
	@GetMapping("/{reqId}")
	public ResponseEntity<?> acceptRequest(@PathVariable Long reqId){
		return ResponseEntity.ok(delService.handleRequest(reqId));
	}
	
	@GetMapping("/logout/{staffId}")
	public ResponseEntity<?> logout(@PathVariable Long staffId){
		return ResponseEntity.ok(delService.logout(staffId));
	}
	
	
	
	
}
