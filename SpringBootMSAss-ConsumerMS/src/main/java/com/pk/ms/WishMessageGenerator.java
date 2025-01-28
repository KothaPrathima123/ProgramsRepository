package com.pk.ms;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pk.client.WishMessageOperationsController;

@RestController
@RequestMapping("/wishMsg")
public class WishMessageGenerator {
	@Autowired
	private WishMessageOperationsController client;
	private String msg;
	@Autowired
	private LocalDateTime time;
	@GetMapping("/details")
	public ResponseEntity<String> showWishMessage(){
		String entity=client.getWishInfo();
		if(time.getHour()<=12)
			msg= "Good Morning";
		if(time.getHour()>=12 && time.getHour()<=16)
			msg= "Good Afternoon";
		if(time.getHour()>=16)
			msg= "Good Evening"; 
		String wishMsg="Wish Message "+LocalDateTime.now().getHour()+msg;
		return new ResponseEntity<String>(wishMsg+"..."+entity,HttpStatus.OK);
	}
	
	
}
