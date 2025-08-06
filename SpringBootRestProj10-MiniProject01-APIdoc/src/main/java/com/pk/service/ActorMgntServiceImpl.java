package com.pk.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.pk.bindings.ActorData;
import com.pk.entity.ActorInfoEntity;
import com.pk.repo.IActorRepository;

@Service("actorService")
public class ActorMgntServiceImpl implements IActorMgntService{
	@Autowired
	private IActorRepository actorRepo;
	@Value("${user.name}")
	private String osuser;
	@Override
	public String registerActor(ActorData actor) {
		//convert binding object data to entity object data
		ActorInfoEntity entity=new ActorInfoEntity();
		BeanUtils.copyProperties(actor, entity);
		//set meta data to entity object 
		entity.setCreatedBy(osuser);
		entity.setUpdatedBy(osuser);
		//save the entity object
		int idVal=actorRepo.save(entity).getAid();
		return "actor is registerd having id value :"+idVal;
	}
	@Override
	public List<ActorData> fetchAllActors() {
		List<ActorInfoEntity> listEntries=actorRepo.findAll();
		//convert list of entries to list of binding class objs
		List<ActorData> listData=new ArrayList<ActorData>();
		for(ActorInfoEntity entity:listEntries) {
			
			System.out.println(entity);
		ActorData data=new ActorData();
		BeanUtils.copyProperties(entity, data);
		listData.add(data);
		}
		System.out.println(listData);
		return listData;
	}
	@Override
	public ActorData fetchActorById(int aid) {
		ActorInfoEntity entity=actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("in valid id"));
		ActorData data=new ActorData();
		BeanUtils.copyProperties(entity, data);
		return data;
	}
	@Override
	public String updateActorData(ActorData data) {
		//use repo
		ActorInfoEntity entity=actorRepo.findById(data.getAid()).orElseThrow(()->new IllegalArgumentException("invalid id"));
		BeanUtils.copyProperties(data, entity);
		entity.setUpdatedBy(osuser);
		//update the object
		int idVal=actorRepo.save(entity).getAid();
		return idVal+"actor data is updated";
	}
	@Override
	public String updateActorRemuneration(int aid, double amount) {
		ActorInfoEntity entity=actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("invalid id"));
		entity.setRemuneration(amount);
		//update the object
		int idVal=actorRepo.save(entity).getAid();
		return idVal+"actor remuneration is updated";
	}
	@Override
	public String updateActorStatus(int aid, String status) {
		ActorInfoEntity entity=actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("invalid id"));
		entity.setActive_SW(status);
		//updte the obj
		int idVal=actorRepo.save(entity).getAid();
		return idVal+" actor status is updated";
	}
	@Override
	public String deleteActorById(int aid) {
		ActorInfoEntity entity=actorRepo.findById(aid).orElseThrow(()->new IllegalArgumentException("invalid id"));
		actorRepo.deleteById(aid);
		return aid+" Actor is deleted";
	}
}
