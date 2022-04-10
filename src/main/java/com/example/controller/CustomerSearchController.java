package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.form.CustomerForm;
import com.example.service.CustomerSearchService;

@Controller
public class CustomerSearchController {

	@Autowired
	private CustomerSearchService service;

	@GetMapping("/search")
	public String getSeach(@ModelAttribute("form") CustomerForm form) {

		// seach.htmlに画面遷移
		return "search";

	}

	@PostMapping("/search/customerSearch")
	public String postSeach(@ModelAttribute("form") CustomerForm form, Model model) {

		service.search(form);

		// 取得した顧客情報をformに登録
		model.addAttribute("form", form);

		// 検索結果を返す
		return "search";
	}

}
