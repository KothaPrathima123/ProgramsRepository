package com.pk.service;

import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service("seasonService")
public class SeasonFinderServiceImpl implements ISeasonFinderService{
	@Override
	public String findCurrentHour() {
		LocalTime currentTime = LocalTime.now();
         int lt=currentTime.getHour();
		if(lt<12)
			return "Good Morning";
		else if(lt<16)
				return "Good Afternoon";
		else if(lt<20)
			return "Good Evening";
		else
			return "Good Night";
	}
}
