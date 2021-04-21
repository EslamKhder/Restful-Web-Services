package com.spring.restful.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/restful/
@RestController  
@RequestMapping("/main")
// http://localhost:8080/restful/main   
public class MainController {
	
	// http://localhost:8080/restful/main/facebook
	@GetMapping("/facebook")
	public String getMain() {
		return "HIIIIIII Eslam";
	}

}
