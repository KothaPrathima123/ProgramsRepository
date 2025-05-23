package com.pk.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.entity.Actor;

@RestController
@RequestMapping("/actor")
public class ActorOperationsController {
	
	@GetMapping("/wish")
	public ResponseEntity<String> displayWishMessage(){
		return new ResponseEntity<String>("Good Morning",HttpStatus.OK);
	}
	@GetMapping("/wish/{id}/{name}")
	//using pathvariable is same as requestparam
	public ResponseEntity<String> displayWishMessage(@PathVariable Integer id,@PathVariable String name){
		return new ResponseEntity<String>("Good Morning::"+id+"...."+name,HttpStatus.OK);
	}
	@GetMapping("/register")
	public ResponseEntity<String> registerActor(@RequestBody Actor actor){
		return new ResponseEntity<String>("Actor data"+actor.toString(),HttpStatus.OK);
	}
	@GetMapping("/find")
	public ResponseEntity<Actor> searchActor(){
		return new ResponseEntity<Actor>(new Actor(200,"salman","hyd",56.0f),HttpStatus.OK);
	}
	

}
