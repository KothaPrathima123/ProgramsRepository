package com.pk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.entity.Actor;
@RestController
@RequestMapping("/actor-api")
public class ActorOperationsController {
	@GetMapping("/report")
	public ResponseEntity<Actor> reportActorData(){
		Actor actor=new Actor(1,"aaa","mumbai",8990.0f);
		return new ResponseEntity<Actor>(actor,HttpStatus.OK);
	}
}
