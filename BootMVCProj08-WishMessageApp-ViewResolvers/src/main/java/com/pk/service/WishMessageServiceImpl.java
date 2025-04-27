package com.pk.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;
@Service("wishService")
public class WishMessageServiceImpl implements IWishMessageService{

	@Override
	public String generateWishMessage(String user) {
	    // Current time 
        LocalTime localTime = LocalTime.now(); 
        System.out.println("Current time: " + localTime); 
//		Date date=new Date();
//		int hour=date.getHours();
        int hour =localTime.getHour();
		String msg=null;
		if(hour<12) 
			msg="good morning ";
		else if(hour>12 && hour<2) 
			msg="good afternoon";
		else if(hour>12 && hour<4) 
			msg="good evening";
		else
			msg="good night";
	
	return msg+user;
	}
}
