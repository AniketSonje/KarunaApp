package com.karuna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.karuna.dto.DonorLoginDto;
import com.karuna.dto.DonorRegisterDto;
import com.karuna.entity.Campaign;
import com.karuna.entity.Donor;
import com.karuna.repos.DonorRepo;

@Service
@CrossOrigin
@Transactional
public class DonorServicesImpl implements DonorServices {
	
     @Autowired
     private DonorRepo donorRepo;

	@Override
	public DonorRegisterDto registerDonor(DonorRegisterDto donor) {
		return donorRepo.save(donor);
	}

	@Override
	public List<Campaign> viewCampaigns() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Donor authenticateDonor(DonorLoginDto donor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Donor updateDonor(Donor donor) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
