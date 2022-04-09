package com.kkt.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kkt.ems.form.EmployeeInformationDeleteForm;
import com.kkt.ems.service.EmployeeInformationDeleteService;

@Controller
public class EmployeeInformationDeleteController {

	@Autowired
	private EmployeeInformationDeleteService service;

	@RequestMapping(value = "/employeeInformationDelete", method = RequestMethod.GET)
	public String index(@ModelAttribute("form") EmployeeInformationDeleteForm form) {
		return "employeeInformationDelete";
	}

	@RequestMapping(value = "/employeeInformationDelete/delete", method = RequestMethod.POST)
	public String delete(@Validated @ModelAttribute("form") EmployeeInformationDeleteForm form, BindingResult result,
			Model model) {

		if (result.hasErrors()) {
			return "employeeInformationDelete";
		}

		service.delete(form);
		model.addAttribute("form", form);
		return "employeeInformationDelete";
	}
}
