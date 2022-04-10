package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.CustomerDto;
import com.example.form.CustomerForm;
import com.example.mapper.CustomerSearchAllDaoMapper;
import com.example.mapper.CustomerSearchDaoMapper;

@Service
public class CustomerSearchService {

	@Autowired
	private CustomerSearchDaoMapper searchDao;
	
	@Autowired
	private CustomerSearchAllDaoMapper searchAllDao;


	public void search(CustomerForm form) {

		List<CustomerDto> customerList = new ArrayList<>();
		String id = form.getCustomerId();

		// 空白で検索した場合
		if (id == null || id.equals("")) {
			customerList = searchAllDao.searchAll();
			form.setCustomerList(customerList);

		} else {

			// 顧客IDで検索した場合
			CustomerDto customerInfo = searchDao.search(id);
			form.setCustomerInfo(customerInfo);

		}
	}
}
