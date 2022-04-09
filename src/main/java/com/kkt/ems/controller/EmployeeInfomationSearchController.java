package com.kkt.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.kkt.ems.form.EMSystemForm;
import com.kkt.ems.service.EmployeeInfomationSearchService;
import com.kkt.ems.mapper.ShainInfoSearchDeleteDaoMapper;

@Controller
@RequestMapping(value = "/employeeInfomationSearch")
public class EmployeeInfomationSearchController {
	@Autowired
	private EmployeeInfomationSearchService service;
	@Autowired
	private ShainInfoSearchDeleteDaoMapper SearchDeleteDao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(@ModelAttribute("form") EMSystemForm form) {
		return "employeeInfomationSearch";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@ModelAttribute("form") EMSystemForm form, Model model) {
		service.select(form);
		model.addAttribute("form", form);
		// html側で検索formの範囲を変えたので検索結果を別途modelに設定する必要ができた
		model.addAttribute("shainInfoList", form.getShainInfoList());
		return "employeeInfomationSearch";
	}

	// 社員情報一覧の削除ボタンを押すとこの処理が呼ばれる
	// 引数に@RequestParamをつけているのでinputタグのname属性が一致するものが設定される
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(@RequestParam String shainNo, Model model) {
		// 本来は削除サービスを呼ぶべきだがパラメータがEmployeeInformationDeleteFormなので呼び出せない。 削除サービスにも手を入れたい
		SearchDeleteDao.deleteByShainNo(shainNo);
		// 削除完了後は検索結果表示に戻る
		return "redirect:/employeeInfomationSearch";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updater(@RequestParam String shainNo, Model model) {
		EMSystemForm form = new EMSystemForm();
		service.updateSelect(shainNo, form);
		model.addAttribute("form", form);
		return "employeeInformationUpdaterSearch";
	}
}