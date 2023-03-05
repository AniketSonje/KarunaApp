package com.karuna.services;

import java.util.List;

import com.karuna.dto.AddCampaignDto;
import com.karuna.entity.Campaign;
import com.karuna.entity.Request;
import com.karuna.entity.Staff;

public interface CustomerExecutiveService {
	
	    Staff login(String email, String password);
	    
	    List<Request> viewRequests(Boolean status);
       	    
	    Campaign addCampaign(AddCampaignDto newCampaign);
	    
	    String deleteCampaign(Long campaignId);
	    
	    String removeDonor(Long donorId);
	    
	    String removeReceiver(Long receiverId);
	    
	    void logout();

		Campaign updateCampaign(AddCampaignDto newCampaign);

		

}
