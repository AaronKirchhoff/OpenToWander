package com.aaronkirchhoff.OpenToWander.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/opentowander")
	public String index() {
		return "index.jsp";
	}
	
	

}
