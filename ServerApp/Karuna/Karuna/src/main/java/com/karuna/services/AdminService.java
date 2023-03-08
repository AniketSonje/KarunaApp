package com.karuna.services;

import java.util.List;

import com.karuna.dto.AddCampaignDto;
import com.karuna.dto.LoginDto;
import com.karuna.dto.RegisterStaffDto;
import com.karuna.entity.Campaign;
import com.karuna.entity.Request;
import com.karuna.entity.Staff;

public interface AdminService {
	
	 Staff login(LoginDto loginDto);
	    
	    List<Request> viewRequests(Boolean status);
    	    
	    Campaign addCampaign(Campaign campaign);
	    
	    String deleteCampaign(Long campaignId);
	    
	    String removeDonor(Long donorId);
	    
	    String removeReceiver(Long receiverId);
	    
	    Campaign updateCampaign(AddCampaignDto newCampaign);
	   
	    Staff addStaff(RegisterStaffDto newStaff);
	    
	    Staff updateStaff(RegisterStaffDto updatedStaff);
	    
	    String deleteStaff(Long staffId);
	    
	    String viewLocationOfDonor();
		 
		 String viewLocationOfReceiver();
		 
		 Boolean checkPaymentStatus();
	    
	    String logout(Long staffId);
	    
	    List<Staff> viewStaffs();
	    

}
