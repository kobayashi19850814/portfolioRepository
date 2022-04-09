package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.form.CustomerForm;
import com.example.service.CustomerService;

@Controller
public class CustomerSearchController {

	@Autowired
	private CustomerService service;

	@GetMapping("/search")
	public String getSeach() {

		// seach.htmlに画面遷移
		return "search";

	}

	@PostMapping("/search")
	public String postSeach(@ModelAttribute("form") CustomerForm form, Model model) {

		service.search(form);

		// 画面から受け取った文字列をModelに登録
		model.addAttribute("form", form);

		// seach.htmlに画面遷移
		return "search";
	}

}
