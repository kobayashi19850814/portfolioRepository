package com.example.form;

import java.util.List;

import com.example.dto.CustomerDto;

public class CustomerForm {

	/** 社員番号 */
	private String customerId;
	/** 社員情報 */
	private CustomerDto customerInfo;
	/** 全社員リスト */
	private List<CustomerDto> customerList;

	
	/** 社員番号を設定 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/** 社員番号を取得 */
	public String getCustomerId() {
		return customerId;
	}

	/** 社員情報を設定 */
	public void setCustomerInfo(CustomerDto customerInfo) {
		this.customerInfo = customerInfo;
	}

	/** 社員情報を取得 */
	public CustomerDto getCustomerInfo() {
		return customerInfo;
	}

	/** 全社員リストを設定 */
	public void setCustomerList(List<CustomerDto> customerList) {
		this.customerList = customerList;
	}

	/** 全社員リストを取得 */
	public List<CustomerDto> getCustomerList() {
		return customerList;
	}
}