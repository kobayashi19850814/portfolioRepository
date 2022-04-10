package com.example.form;

import java.util.List;

import com.example.dto.CustomerDto;

public class CustomerForm {

	/** 顧客ID */
	private String customerId;
	/** 顧客情報 */
	private CustomerDto customerInfo;
	/** 全顧客リスト */
	private List<CustomerDto> customerList;

	
	/** 顧客IDを設定 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/** 顧客IDを取得 */
	public String getCustomerId() {
		return customerId;
	}

	/** 顧客情報を設定 */
	public void setCustomerInfo(CustomerDto customerInfo) {
		this.customerInfo = customerInfo;
	}

	/** 顧客情報を取得 */
	public CustomerDto getCustomerInfo() {
		return customerInfo;
	}

	/** 全顧客リストを設定 */
	public void setCustomerList(List<CustomerDto> customerList) {
		this.customerList = customerList;
	}

	/** 全顧客リストを取得 */
	public List<CustomerDto> getCustomerList() {
		return customerList;
	}
}