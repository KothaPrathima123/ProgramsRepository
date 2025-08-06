package com.pk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.IActorMgntService;
import com.pk.bindings.ActorData;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/actor-api")
@Tag(name="actor",description="Actor Operations Controller")
public class ActorOperationsController {
	@Autowired
	private IActorMgntService actorService;
	@Operation(summary="saves the actor info",description="persist the actor info")
//	@ApiResponses(value = {
	@ApiResponses(responseCode="201",description="actor saved",
	content= { @Content(mediaType="application/json",schema=@Schema(implementation=ActorData.class))})})	
	@PostMapping("/save")
	public ResponseEntity<String> saveActor(@RequestBody ActorData data){
		try {	
		String resultMsg=actorService.registerActor(data);
			return new ResponseEntity<String>(resultMsg,HttpStatus.CREATED);//201 content created successfully
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}