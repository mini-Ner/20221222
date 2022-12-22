package com.shop.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminConTroller {
	
	@RequestMapping("/")
	public String main() {
		return "index";
	}
}
