package com.example.form;


public class CustomerRegistionForm {

	/** 顧客ID */
	private String customerId;
	/** 顧客名 */
	private String customerName;
	/** 顧客名（カナ） */
	private String customerNameKn;
	/** 電話番号 */
	private String customerTelephoneNumber;
	/** 郵便番号 */
	private String customerPostCode;
	/** 住所 */
	private String customerAddress;
	/**メッセージ*/
	private String message;

	
	/** 顧客IDを設定 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/** 顧客IDを取得 */
	public String getCustomerId() {
		return customerId;
	}

	/** 顧客名を設定 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/** 顧客名を取得 */
	public String getCustomerName() {
		return customerName;
	}

	/** 顧客名（カナ）を設定 */
	public void setCustomerNameKn(String customerNameKn) {
		this.customerNameKn = customerNameKn;
	}

	/** 顧客名（カナ）を取得 */
	public String getCustomerNameKn() {
		return customerNameKn;
	}

	/** 電話番号を設定 */
	public void setCustomerTelephoneNumber(String customerTelephoneNumber) {
		this.customerTelephoneNumber = customerTelephoneNumber;
	}

	/** 電話番号を取得 */
	public String getCustomerTelephoneNumber() {
		return customerTelephoneNumber;
	}

	/** 郵便番号を設定 */
	public void setCustomerPostCode(String customerPostCode) {
		this.customerPostCode = customerPostCode;
	}

	/** 郵便番号を取得 */
	public String getCustomerPostCode() {
		return customerPostCode;
	}

	/** 住所を設定 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	/** 住所を取得 */
	public String getCustomerAddress() {
		return customerAddress;
	}
	
	/** メッセージを設定 */
	public void setMessage(String message) {
		this.message = message;
	}

	/** メッセージを取得 */
	public String getMessage() {
		return message;
	}
	
}