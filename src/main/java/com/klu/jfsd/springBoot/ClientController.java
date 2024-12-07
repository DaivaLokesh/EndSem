package com.klu.jfsd.springBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/springMVC")
public class ClientController {
 
	 @GetMapping("/about")
	 public String demo() {
		 
		 return "about";
	 }
}
