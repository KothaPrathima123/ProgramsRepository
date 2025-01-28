package com.pk.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.pk.bindings.ActorData;
import com.pk.entity.ActorInfoEntity;

public interface IActorRepository extends JpaRepository<ActorInfoEntity,Integer>{

}
