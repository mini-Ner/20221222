package com.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopConTroller {

	@RequestMapping("/")
	public String main() {
		return "shop" ;
	}
}
