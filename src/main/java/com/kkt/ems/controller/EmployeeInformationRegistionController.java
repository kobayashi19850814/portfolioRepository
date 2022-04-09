package com.kkt.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.kkt.ems.form.EmployeeInformationRegistionForm;
import com.kkt.ems.service.EmployeeInformationRegistionService;
@Controller
public class EmployeeInformationRegistionController {
	@Autowired
	private EmployeeInformationRegistionService service;
	
	@RequestMapping(value = "/employeeInformationRegister", method = RequestMethod.GET)
	public String index(@ModelAttribute("form") EmployeeInformationRegistionForm form) {
		return "employeeInformationRegister";
	}
	
	@RequestMapping(value = "/employeeInformationRegister/register", method = RequestMethod.POST)
	public String register(@Validated @ModelAttribute("form") EmployeeInformationRegistionForm form,
			BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			return "employeeInformationRegister";
		}
		service.register(form);
		model.addAttribute("form", form);
		return "employeeInformationRegister";
	}
}