package com.karuna.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.karuna.entity.Donor;
import com.karuna.entity.Receiver;
import com.karuna.entity.Request;
import com.karuna.entity.Staff;
import com.karuna.exception.ResourceNotFoundException;
import com.karuna.repos.DonorRepo;
import com.karuna.repos.PaymentRepo;
import com.karuna.repos.ReceiverRepo;
import com.karuna.repos.RequestRepo;
import com.karuna.repos.StaffRepo;

public class DeliveryPartnerServiceImpl implements DeliveryPartnerService {
	
	  @Autowired
	    private RequestRepo reqRepo;

	    @Autowired
	    private StaffRepo staffRepo;
	    
	    
	    @Autowired
	    private DonorRepo donorRepo;
	    
	    @Autowired
	    private ReceiverRepo receiverRepo;
	    
	    @Autowired
		private ModelMapper mapper;
	    
	    @Autowired
	    private PaymentRepo paymentRepo;


	@Override
	public Staff login(String email, String password) {
		 Staff staff=staffRepo.findByEmail(email);
			if(staff!=null && password.matches(staff.getPassword())){
				return staff;
			}
			else {
				throw new ResourceNotFoundException("Invalid email or Password");
			}
	}

	@Override
	public List<Request> viewRequests(Boolean status) {
		return reqRepo.findAllByStatus(status);

	}

	@Override
	public String viewLocationOfDonor(Donor donor) {
		if(donorRepo.existsById(donor.getId())) {
			return donor.getAddress();
		}
		return "Donor does not exist";
	}

	@Override
	public String viewLocationOfReceiver(Receiver receiver) {
	   if(receiverRepo.existsById(receiver.getId())) {
		   return receiver.getAddress();
	   }
	   return "Receiver does not exist";
	}

	@Override
	public Boolean checkPaymentStatus() {
		return true;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

}