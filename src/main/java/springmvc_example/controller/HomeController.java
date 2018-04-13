package springmvc_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String welcome() {
		return "Hi, Spring Hibernate Mysql Restful App is up and running...!";
	}
}
