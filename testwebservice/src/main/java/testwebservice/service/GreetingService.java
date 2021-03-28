package testwebservice.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	public String viewGreeting(String name) {
		return "Goodevening" + name;
	}

}
