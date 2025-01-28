package com.pk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.entity.CallerTuneInfo;
import com.pk.repository.ICallerTuneInfoRepository;

@Service("callerTuneService")
public class CallerTuneMgntServiceImpl implements ICallerTuneMgntService{
	@Autowired
	private ICallerTuneInfoRepository callerTuneRepo;
	
	@Override
	public String saveCallerTuneInfo(CallerTuneInfo info) {
		Integer idVal=callerTuneRepo.save(info).getTuneId();
		return "caller tune is saved with the id value:: "+idVal;
	}

	@Override
	public String updateTuneInfoById(Integer id, String tuneName, String movieName) {
		Optional<CallerTuneInfo> opt=callerTuneRepo.findById(id);
		if(opt.isPresent()) {
			CallerTuneInfo info=opt.get();
			info.setTuneName(tuneName);
			info.setMovieName(movieName);
			CallerTuneInfo tune=callerTuneRepo.save(info);
			return "Obj is updated for "+tune.getUpdatedCount()+" times lastly modified on:"+tune.getLastlyUpdatedOn()+"..created on::"+tune.getServiceOptedOn();
		} else {
		return "CallerTuneService is Not Found";
		}
		}

	@Override
	public CallerTuneInfo showCallerTuneDetailsById(Integer id) {
		// TODO Auto-generated method stub
		return callerTuneRepo.findById(id).orElseThrow(()->new IllegalArgumentException("caller tune not found"));
	}
	
}
