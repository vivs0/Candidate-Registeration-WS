package org.candidate.ws.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
	
	@RequestMapping(value="/new/registeration")
	public String home(){
		return "index";
	}
}
