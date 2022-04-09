package com.kkt.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kkt.ems.dto.ShainInfoDto;
import com.kkt.ems.form.EMSystemForm;
import com.kkt.ems.form.EmployeeInformationDeleteForm;
import com.kkt.ems.mapper.ShainInfoDaoMapper;
import com.kkt.ems.mapper.ShainInfoDeleteDaoMapper;

@Service
public class EmployeeInformationDeleteService {

	@Autowired
	private ShainInfoDeleteDaoMapper deleteDao;
	@Autowired
	private ShainInfoDaoMapper dao;

	public void delete(EmployeeInformationDeleteForm form) {

		ShainInfoDto shainInfo = dao.select(form.getShainNo());
		String message = null;

		if (shainInfo == null) {
			message = "入力された社員情報" + form.getShainNo() + "は登録されていません";
			form.setMessage(message);
			return;
		}
		try {
			deleteDao.delete(form.getShainNo());
			message = "社員情報" + form.getShainNo() + "が削除されました";
			form.setMessage(message);

		} catch (Exception e) {
			message = "社員情報の削除に失敗しました";
			form.setMessage(message);
		}
	}

	public void delete(EMSystemForm form) {
		
		deleteDao.delete(form.getShainNo());

	}
}