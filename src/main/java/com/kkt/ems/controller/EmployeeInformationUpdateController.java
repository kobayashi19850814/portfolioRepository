package com.kkt.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.kkt.ems.form.EmployeeInformationUpdateForm;
import com.kkt.ems.service.EmployeeInformationUpdateService;

@Controller
public class EmployeeInformationUpdateController {
	@Autowired
	private EmployeeInformationUpdateService service;

	@RequestMapping(value = "/employeeInformationUpdater/", method = RequestMethod.GET)
	public String index(@ModelAttribute("form") EmployeeInformationUpdateForm form) {
		return "employeeInformationUpdater";
	}

	@RequestMapping(value = "/employeeInformationUpdater/update", method = RequestMethod.POST)
	public String updater(@Validated @ModelAttribute("form") EmployeeInformationUpdateForm form, BindingResult result,
			Model model) {

		if (result.hasErrors()) {

			return "employeeInformationUpdater";
		}
		service.update(form);
		model.addAttribute("form", form);
		return "employeeInformationUpdater";
	}
}
