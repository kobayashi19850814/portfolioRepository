package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerTopPageController {

	@GetMapping("/")
	public String getTopPage() {

		// topPage.htmlに画面遷移
		return "topPage";

	}

}
