package testwebservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import testwebservice.service.GreetingService;

@RequestMapping("/api")
@RestController
public class GreetingRest {
    
	@Autowired
	GreetingService service;
	
    //http://localhost:8080/api/greet/name/surname

	@GetMapping("/greet/{name}/{lastname}")
	public String greetmeplease(@PathVariable("name") String name, @PathVariable("lastname") String lastname) {
	  return service.viewGreeting(name + "" + lastname);
	}
	
	//http://localhost:8080/api/greet?name=Michael&school=BSU

	@GetMapping("/greet")
	public String greetByPassingParam(@RequestParam String name, @RequestParam String school) {
		return service.viewGreeting(name + "You are studying in" + school);
	}
	
}
