package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.form.CustomerRegistionForm;
import com.example.service.CustomerRegistionService;

@Controller
public class CustomerRegistionController {

	@Autowired
	private CustomerRegistionService service;

	@GetMapping("/Register")
	public String getRegister(@ModelAttribute("form") CustomerRegistionForm form) {

		// register.htmlに画面遷移
		return "register";
	}

	@PostMapping("/Register/customerRegister")
	public String postRegister(@ModelAttribute("form") CustomerRegistionForm form, Model model) {

		service.register(form);

		// 取得したメッセージをformに登録
		model.addAttribute("form", form);

		// 検索結果を返す
		return "register";

	}

}
