package in.ammyit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hi Amrish, Hello from docker World";
	}
	
}
