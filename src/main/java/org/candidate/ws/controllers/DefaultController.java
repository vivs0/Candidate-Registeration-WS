package org.candidate.ws.controllers;

import javax.ws.rs.POST;

import org.candidate.ws.models.Candidate;
import org.candidate.ws.services.IfaceRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	@Autowired
	private IfaceRegisterService service;
	
	
	@RequestMapping(value="/new/registeration", headers="Accept=application/json")
	@POST
	public ResponseEntity<Void> Save(@RequestBody Candidate candidate){
		HttpHeaders header = new HttpHeaders();
		try{
			service.Register(candidate);
			return new ResponseEntity<Void>(header, HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<Void>(header, HttpStatus.EXPECTATION_FAILED);
		}
		
	}
}
