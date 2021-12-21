package com.javatpoint;
import org.springframework.stereotype.Controller;
@Controller
public class HelloController {
@RequestMapping("/")
	public String display()
	{
		return "index";
	}	
}
