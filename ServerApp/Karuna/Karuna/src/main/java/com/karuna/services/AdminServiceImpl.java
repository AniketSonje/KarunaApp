package com.karuna.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.karuna.dto.AddCampaignDto;
import com.karuna.dto.LoginDto;
import com.karuna.dto.RegisterStaffDto;
import com.karuna.entity.Campaign;
import com.karuna.entity.Donor;
import com.karuna.entity.Request;
import com.karuna.entity.Staff;
import com.karuna.exception.ResourceNotFoundException;
import com.karuna.repos.CampaignRepo;
import com.karuna.repos.DonorRepo;
import com.karuna.repos.PaymentRepo;
import com.karuna.repos.ReceiverRepo;
import com.karuna.repos.RequestRepo;
import com.karuna.repos.StaffRepo;

public class AdminServiceImpl implements AdminService {
	
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
	    
	    @Autowired
	    private CampaignRepo campaignRepo;

	@Override
	public Staff login(LoginDto loginDto) {
		Staff staff= staffRepo.findByEmailAndPassword(loginDto.getEmail(), loginDto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
		staff.setStatus(true);
		return mapper.map(staff, Staff.class);
	}

	@Override
	public List<Request> viewRequests(Boolean status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Campaign addCampaign(Campaign campaign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCampaign(Long campaignId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeDonor(Long donorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeReceiver(Long receiverId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Campaign updateCampaign(AddCampaignDto newCampaign) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff addStaff(RegisterStaffDto newStaff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Staff updateStaff(RegisterStaffDto updatedStaff) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStaff(Long staffId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logout(Long staffId) {
		staffRepo.findById(staffId).orElseThrow().setStatus(false);
		return "Successfully Logged Out !!!";
		
	}

	@Override
	public List<Staff> viewStaffs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewLocationOfDonor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String viewLocationOfReceiver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean checkPaymentStatus() {
		// TODO Auto-generated method stub
		return null;
	}

}
