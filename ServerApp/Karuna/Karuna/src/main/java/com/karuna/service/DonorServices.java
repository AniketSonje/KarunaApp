package com.karuna.service;

import java.util.List;

import com.karuna.dto.DonorLoginDto;
import com.karuna.dto.DonorRegisterDto;
import com.karuna.entity.Campaign;
import com.karuna.entity.Donor;

public interface DonorServices {
	
	DonorRegisterDto registerDonor(DonorRegisterDto donor);
	
	List<Campaign> viewCampaigns();
	
	Donor authenticateDonor(DonorLoginDto donor);
	
	Donor updateDonor(Donor donor);

	
 

}
