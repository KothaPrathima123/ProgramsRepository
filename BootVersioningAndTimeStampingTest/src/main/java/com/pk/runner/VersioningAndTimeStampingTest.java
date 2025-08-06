package com.pk.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pk.entity.CallerTuneInfo;
import com.pk.service.ICallerTuneMgntService;

@Component
public class VersioningAndTimeStampingTest implements CommandLineRunner {
	@Autowired
	private ICallerTuneMgntService service;

	@Override
	public void run(String... args) throws Exception {
		try {
			CallerTuneInfo info=new CallerTuneInfo("oo antava mama","pushpa");
			System.out.println(service.saveCallerTuneInfo(info));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------");
		try {
			System.out.println(service.updateTuneInfoById(1,"joome jo pathan1","pathan"));
			System.out.println(service.showCallerTuneDetailsById(1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("--------------------------");
		try {
			System.out.println(service.updateTuneInfoById(1,"Natu Natu1","RRR"));
			System.out.println(service.showCallerTuneDetailsById(1));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}
