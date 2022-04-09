package com.kkt.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkt.ems.dto.ShainInfoDto;
import com.kkt.ems.form.EmployeeInformationRegistionForm;
import com.kkt.ems.mapper.EmployeeRegistionDaoMapper;

@Service
public class EmployeeInformationRegistionService {
	@Autowired
	private EmployeeRegistionDaoMapper daoRegister;

	public void register(EmployeeInformationRegistionForm form) {
		
		ShainInfoDto shainRegister = new ShainInfoDto();
		String message = null;
		
		shainRegister.setShainNo(form.getShainNo());
		shainRegister.setShainNameKj(form.getShainNameKj());
		shainRegister.setShainNameKn(form.getShainNameKn());
		shainRegister.setBushoName(form.getBushoName());
			
		try {
				daoRegister.register(shainRegister);
				message = "社員情報が登録されました。";
				form.setMessage(message);
			} catch (Exception e) {
				message = "指定された社員番号は登録済みです。";
				form.setMessage(message);
		}	
	}
}	
