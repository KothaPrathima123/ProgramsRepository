package com.pk.service;

import java.util.List;

import com.pk.bindings.ActorData;

public interface IActorMgntService {
	public String registerActor(ActorData actor);
	public List<ActorData> fetchAllActors();
	public ActorData fetchActorById(int aid);
	public String updateActorData(ActorData data);
	public String updateActorRemuneration(int aid,double amount);
	public String updateActorStatus(int aid,String status);
	public String deleteActorById(int aid);
}
