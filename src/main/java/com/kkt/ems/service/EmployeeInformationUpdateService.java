package com.kkt.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkt.ems.dto.ShainInfoDto;
import com.kkt.ems.form.EmployeeInformationUpdateForm;
import com.kkt.ems.mapper.EmployeeUpdateDaoMapper;

@Service
public class EmployeeInformationUpdateService {
	@Autowired
	private EmployeeUpdateDaoMapper daoUpdater;

	ShainInfoDto shainUpdate = new ShainInfoDto();
	String message = null;

	public void update(EmployeeInformationUpdateForm form) {

		ShainInfoDto shainUpdate = new ShainInfoDto();
		String message = null;

		shainUpdate.setShainNo(form.getShainNo());
		shainUpdate.setShainNameKj(form.getShainNameKj());
		shainUpdate.setShainNameKn(form.getShainNameKn());
		shainUpdate.setBushoName(form.getBushoName());

		try {
			daoUpdater.updater(shainUpdate);
			message = "社員情報が更新されました。";
			form.setMessage(message);
		} catch (Exception e) {
			message = "更新されませんでした";
			form.setMessage(message);
		}
	}
}
