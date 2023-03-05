package com.karuna.services;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karuna.dto.AddCampaignDto;
import com.karuna.entity.Campaign;
import com.karuna.entity.Request;
import com.karuna.entity.Staff;
import com.karuna.exception.ResourceNotFoundException;
import com.karuna.repos.CampaignRepo;
import com.karuna.repos.DonorRepo;
import com.karuna.repos.ReceiverRepo;
import com.karuna.repos.RequestRepo;
import com.karuna.repos.StaffRepo;

@Service
@Transactional
public class CustomerExecutiveServiceImpl implements CustomerExecutiveService {
	
	    @Autowired
	    private RequestRepo reqRepo;

	    @Autowired
	    private StaffRepo staffRepo;
	    
	    @Autowired
	    private CampaignRepo campaignRepo;
	    
	    @Autowired
	    private DonorRepo donorRepo;
	    
	    @Autowired
	    private ReceiverRepo receiverRepo;
	    
	    @Autowired
		private ModelMapper mapper;

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
	public Campaign addCampaign(AddCampaignDto newCampaign) {
		 Campaign campaign=mapper.map(newCampaign, Campaign.class);
		return campaignRepo.save(campaign);
		
	}

	@Override
	public Campaign updateCampaign(AddCampaignDto updatedCampaign) {
	      Campaign campaign=mapper.map(updatedCampaign, Campaign.class);
	      if(campaignRepo.existsById(updatedCampaign.getId())) {
	    	  return campaignRepo.save(campaign);
	      }
	      return null;
	}

	@Override
	public String deleteCampaign(Long campaignId) {
		campaignRepo.deleteById(campaignId);
		return "Campaign Deleted !!!";
	
		
	}

	@Override
	public String removeDonor(Long donorId) {
		donorRepo.deleteById(donorId);
		return "Donor Deleted!!!";
		
		
	}

	@Override
	public String removeReceiver(Long receiverId) {
		receiverRepo.deleteById(receiverId);
		return "Receiver Deleted!!!";
		
	}

	@Override
	public void logout() {
	  
		
	}

}