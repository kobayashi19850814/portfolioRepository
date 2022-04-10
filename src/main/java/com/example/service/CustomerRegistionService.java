package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CustomerDto;
import com.example.form.CustomerRegistionForm;
import com.example.mapper.CustomerRegistionDaoMapper;

@Service
public class CustomerRegistionService {

	@Autowired
	CustomerDto cI;

	@Autowired
	CustomerRegistionDaoMapper registionDao;

	public void register(CustomerRegistionForm form) {

		String message = null;

		// 入力された値をDTOに登録
		cI.setCustomerId(form.getCustomerId());
		cI.setCustomerName(form.getCustomerName());
		cI.setCustomerNameKn(form.getCustomerNameKn());
		cI.setCustomerTelephoneNumber(form.getCustomerTelephoneNumber());
		cI.setCustomerPostCode(form.getCustomerPostCode());
		cI.setCustomerAddress(form.getCustomerAddress());

		try {

			// 登録成功メッセージをformに登録
			registionDao.register(cI);
			message = "登録されました。";
			form.setMessage(message);

		} catch (Exception e) {

			// 登録失敗メッセージをformに登録 データベースからの例外をキャッチ
			message = "入力されたIDはすでに登録済みです。";
			form.setMessage(message);
			
		}

	}
}
