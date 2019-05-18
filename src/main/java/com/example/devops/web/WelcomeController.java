package com.example.devops.web;

import org.springframework.stereotype.Controller;

public class WelcomeController {
	@RequestMapping("/")
	public String Welcome(Model, model) {
		model.addAttribute("course", "DevOps");
		return index;
	}

}
