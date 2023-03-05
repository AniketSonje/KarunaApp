package com.karuna.services;

import java.util.List;

import com.karuna.dto.LoginDto;
import com.karuna.dto.LogoutDto;
import com.karuna.dto.RegisterReceiverDto;
import com.karuna.dto.RequestDto;
import com.karuna.entity.Donor;
import com.karuna.entity.Item;
import com.karuna.entity.Receiver;
import com.karuna.entity.Request;

public interface ReceiverService {
	
    Receiver registerReceiver(RegisterReceiverDto newReceiver);
	
	Receiver login(LoginDto loginDto);
	
	Item receive(Item item);
	
	String logout(LogoutDto logoutDto);
	
	String deleteAccount(Long receiverId);
	
	Receiver updateReceiver(RegisterReceiverDto updatedReceiver);

	List<Item> viewItems();
	
	List<Item> viewHistory(Receiver receiver);
	
	List<Donor> viewDonors();
	
	Request createRequest(RequestDto request);

	
	
	
	

}
