package com.klu.jfsd.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @GetMapping("/about")
	 public String demo() {
		 
		 return "about";
	 }
    
    @RequestMapping("/greet")
    public String greetUser(@RequestParam("username") String username, Model model) {
        model.addAttribute("message", "Hello, " + username + "!");
        return "greet";
    }
    
    @RequestMapping("/demo1")
    public String demo1(@RequestParam("age") int age, @RequestParam("country") String country, Model model) {
        model.addAttribute("age", age);
        model.addAttribute("country", country);
        return "demo1";
    }

    @RequestMapping("/demo2/{value1}/{value2}")
    public String demo2(@PathVariable("value1") int value1, @PathVariable("value2") int value2, Model model) {
        model.addAttribute("subtraction", value1 - value2);
        model.addAttribute("division", value1 / value2);
        return "demo2";
    }

    @RequestMapping("/productform")
    public String productForm() {
        return "productform";
    }

    @RequestMapping("/multiplyNumbers")
    public String multiplyNumbers(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("result", num1 * num2);
        return "multiplyNumbers";
    }

    @RequestMapping("/reverse")
    public String reverseStrings(@RequestParam("str1") String str1, @RequestParam("str2") String str2, Model model) {
        model.addAttribute("reversedStr1", new StringBuilder(str1).reverse().toString());
        model.addAttribute("reversedStr2", new StringBuilder(str2).reverse().toString());
        return "reverse";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        model.addAttribute("addition", num1 + num2);
        model.addAttribute("subtraction", num1 - num2);
        return "calculate";
    }
	
}
