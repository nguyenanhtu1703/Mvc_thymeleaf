package com.nguyenanhtu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyOwnController {
	
	@Value("${welcome.message}")
	String tmp;
	
	@GetMapping("/lol")
	String hello(Model model) {
		System.out.println(tmp);
		model.addAttribute("message", "nguyenanhtu");
		return "welcome";
	}
}
