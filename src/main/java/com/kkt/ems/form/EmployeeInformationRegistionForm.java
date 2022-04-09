package com.kkt.ems.form;

import javax.validation.constraints.Pattern;

public class EmployeeInformationRegistionForm {
	
	/** 社員番号 */
	@Pattern(regexp = "[0-9]{4}",message = "社員番号 : 半角英数字4桁で入力してください")
	private String shainNo;
	
	/** 社員名(漢字)*/
	@Pattern(regexp = "([ぁ-んァ-ヶー一-龠]+　[ぁ-んァ-ヶー一-龠]+)",
			message = "社員名(漢字) : 姓名の間に全角スペースを入れ、全角カナひら漢字で入力してください")
	private String shainNameKj;
	
	/**社員名(カナ)*/
	@Pattern(regexp = "([ア-ン゛゜ァ-ォャ-ョー「」、]+　[ア-ン゛゜ァ-ォャ-ョー「」、]+)",
			message = "社員名(カナ) : 姓名の間に全角スペースを入れ、全角カナで入力してください")
	private String shainNameKn;
	
	/**部署名*/
	@Pattern(regexp ="^(?!.*選択してください).+$",
			message = "所属部署 : 選択してください")
	private String bushoName;

	/** メッセージ */
	private String message;

	/**
	 * 社員番号を設定します。
	 * 
	 * @param 社員番号 shainNo
	 */
	public void setShainNo(String shainNo) {
		this.shainNo = shainNo;
	}
	
	/**
	 * 社員番号を取得します。
	 * 
	 * @return 社員番号 shainNo
	 */
	public String getShainNo() {
		return shainNo;
	}
	
	/**
	 * 社員名(漢字)を設定します。
	 * 
	 * @param 社員名(漢字) shainNameKj
	 *
	 */
	public void setShainNameKj(String shainNameKj) {
		this.shainNameKj = shainNameKj;
	}
	
	/**
	 * 社員名(漢字)を取得します。
	 * 
	 * @return 社員名(漢字) shainNameKj
	 *
	 */
	public String getShainNameKj() {
		return shainNameKj;
	}
	
	/**
	 * 社員名(カナ)を設定します。
	 * 
	 * @param 社員名(カナ) shainNameKn
	 *
	 */
	public void setShainNameKn(String shainNameKn) {
		this.shainNameKn = shainNameKn;
	}
	
	/**
	 * 社員名(カナ)を取得します。
	 * 
	 * @return 社員名(カナ) shainNameKn
	 *
	 */
	
	public String getShainNameKn() {
		return shainNameKn;
	}
	
	/**
	 * 部署名を設定します。
	 * 
	 * @param 部署名 bushoName
	 *
	 */
	public void setBushoName(String bushoName) {
		this.bushoName = bushoName;
	}
	
	/**
	 * 部署名を取得します。
	 * 
	 * @return 部署名 bushoName
	 *
	 */
	public String getBushoName() {
		return bushoName;
	}
	
	/**
	 * 登録成否メッセージを設定します。
	 * 
	 * @param 登録成否メッセージ messege
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * メッセージを取得します。
	 * 
	 * @return メッセージ messege
	 */
	public String getMessage() {
		return message;
	}
}	