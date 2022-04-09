package com.kkt.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.kkt.ems.dto.ShainInfoDto;
import com.kkt.ems.form.EMSystemForm;
import com.kkt.ems.mapper.ShainInfoChartDaoMapper;
import com.kkt.ems.mapper.ShainInfoDaoMapper;

@Service
public class EmployeeInfomationSearchService {
	@Autowired
	private ShainInfoDaoMapper dao;
	@Autowired	
	private ShainInfoChartDaoMapper chartDao;
	
	public void select(EMSystemForm form) {

		List<ShainInfoDto> shainInfoList = new ArrayList<>();
		
		if (form.getShainNo().equals("") || form.getShainNo() == null) {
			// 空白で検索した場合	
			shainInfoList = chartDao.chart();
			form.setShainInfoList(shainInfoList);

		} else {
			// 社員番号で検索した場合
			ShainInfoDto shainInfo = dao.select(form.getShainNo());
			form.setShainInfo(shainInfo);
		}
	}
	
	public void updateSelect(String shainNo, EMSystemForm form) {
		ShainInfoDto shainInfo = dao.select(shainNo);
		form.setShainInfo(shainInfo);
	}
}
