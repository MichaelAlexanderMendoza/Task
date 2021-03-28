package testwebservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/first")
@RestController
public class Task {
	
	@Autowired
	TaskService service;
	
	@Value("${custom.config.key}")
	float key;
	
	//http://localhost:8080/first/task?t=1&a=2&s=3&k=4
	@GetMapping("/task")
	public String greetByPassingParam(@RequestParam int t, @RequestParam int a, @RequestParam int s, @RequestParam int k) {
		return service.viewGreeting((t+a+s+k) * key);
	}
	

}
