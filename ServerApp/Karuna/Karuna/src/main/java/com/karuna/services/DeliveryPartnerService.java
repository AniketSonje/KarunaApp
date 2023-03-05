package com.karuna.services;

import java.util.List;

import com.karuna.entity.Donor;
import com.karuna.entity.Receiver;
import com.karuna.entity.Request;
import com.karuna.entity.Staff;

public interface DeliveryPartnerService {
	
	Staff login(String email,String password);
	
	List<Request> viewRequests(Boolean status);
	 
	 String viewLocationOfDonor(Donor donor);
	 
	 String viewLocationOfReceiver(Receiver receiver);
	 
	 Boolean checkPaymentStatus();
	 
	 void logout();
	 

}
