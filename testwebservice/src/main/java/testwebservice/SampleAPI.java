package testwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/sample")
@RestController
public class SampleAPI {
	//http://localhost:8080/api/viewstatus
	@GetMapping("/view")
	public String viewStatus() {
		return "OK :)";
	}
	
}
                              