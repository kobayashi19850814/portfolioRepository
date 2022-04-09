package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CustomerDto;
import com.example.form.CustomerForm;
import com.example.mapper.CustomerDaoMapper;

@Service
public class CustomerService {

	@Autowired
	private CustomerDaoMapper dao;

	public void search(CustomerForm form)  {

		String id = form.getCustomerId();

		// 空白で検索した場合
		if(id == null || id.equals("")) {
	
		}
		// 顧客IDで検索した場合
		CustomerDto customerInfo = dao.search(id);

		// DBから取得した情報をformに設定
		form.setCustomerInfo(customerInfo);

	}

}
