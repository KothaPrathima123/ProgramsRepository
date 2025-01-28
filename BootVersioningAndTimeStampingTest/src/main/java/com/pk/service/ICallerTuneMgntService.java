package com.pk.service;

import com.pk.entity.CallerTuneInfo;

public interface ICallerTuneMgntService {
	public String saveCallerTuneInfo(CallerTuneInfo info);
	public String updateTuneInfoById(Integer id,String tuneName,String movieName);
	public CallerTuneInfo showCallerTuneDetailsById(Integer id);
}
