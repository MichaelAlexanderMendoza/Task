package testwebservice;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
	public String viewGreeting(double u) {
		return "Answer:" + u;
	}

}
