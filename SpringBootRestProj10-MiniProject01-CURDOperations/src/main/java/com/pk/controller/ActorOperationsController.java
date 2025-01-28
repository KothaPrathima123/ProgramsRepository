package com.pk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pk.bindings.ActorData;
import com.pk.service.IActorMgntService;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationsController {
	@Autowired
	private IActorMgntService actorService;
	@PostMapping("/save")
	public ResponseEntity<String> saveActor(@RequestBody ActorData data){
			String resultMsg=actorService.registerActor(data);
			return new ResponseEntity<String>(resultMsg,HttpStatus.CREATED);//201 content created successfully
		
	}
	@GetMapping("/all")
	public ResponseEntity<List<ActorData>> displayActors(){
		//use service
			List<ActorData> listData=actorService.fetchAllActors();
			return new ResponseEntity<List<ActorData>>(listData,HttpStatus.OK);
		}
	@GetMapping("/find/{aid}")
	public ResponseEntity<?> displayActorById(@PathVariable("aid") Integer id){
			ActorData actor=actorService.fetchActorById(id);
			return new ResponseEntity<ActorData>(actor,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String> updateActorData(@RequestBody ActorData data){
		String msg=actorService.updateActorData(data);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@PatchMapping("/rupdate/{id}/{amount}")
	public ResponseEntity<String> updateActorRemuneration(@PathVariable Integer id,@PathVariable double amount){
		String msg=actorService.updateActorRemuneration(id, amount);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@PatchMapping("/supdate/{id}/{status}")
	public ResponseEntity<String> updateActorStatus(@PathVariable Integer id,@PathVariable String status){
		String msg=actorService.updateActorStatus(id, status);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Integer id){
		String msg=actorService.deleteActorById(id);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
