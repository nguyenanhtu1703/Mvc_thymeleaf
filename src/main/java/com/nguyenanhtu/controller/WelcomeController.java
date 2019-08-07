package com.nguyenanhtu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WelcomeController {

	public Bean z;
	
	@Autowired
	public void setBean(Bean k) {
		System.out.println("setter");
		this.z = k;
	}
	
    // inject via application.properties
    @Value("${welcome.message}")
    private String message;

    private List<String> tasks = Arrays.asList("a", "b", "c", "d", "e", "f", "g");
    private Map<String, String> maps = new HashMap<String, String>()
    { 
      {
    	put("1", "a");
    	put("2", "b");
    	put("3", "c");
      }
    };
    
    private List<String> lists = new ArrayList<String>(tasks);
    
    String[] t = new String[] {"1","2"};
    
    @GetMapping("/")
    public String main(Model model) {
    	model.addAttribute("message", message);
    	model.addAttribute("tasks", tasks);
    	model.addAttribute("what", maps);
    	return "welcome";
    }
    
    @GetMapping("/hello")
    public String mainWithParam(@RequestParam(name="nguyenanhtu", required=false, defaultValue="nguyenanhtu") 
    String name, Model model) {
    	System.out.println(name);
    	model.addAttribute("message", name);
    	return "welcome";
    }
    
}
