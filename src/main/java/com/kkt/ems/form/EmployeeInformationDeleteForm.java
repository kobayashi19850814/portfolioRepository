package com.kkt.ems.form;

import java.util.List;

import javax.validation.constraints.Pattern;

import com.kkt.ems.dto.ShainInfoDto;

public class EmployeeInformationDeleteForm {

	/** 社員番号 */
	@Pattern(regexp = "[0-9]{4}",message = "社員番号は半角英数字4桁で入力してください")
	private String shainNo;
	
	/** 社員情報 */
	private ShainInfoDto shainInfo;
	
	/** 全社員リスト */
	private List<ShainInfoDto> shainInfoList;
	
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
	 * 社員情報を設定します。
	 * 
	 * @param 社員情報 shainInfo
	 */
	public void setShainInfo(ShainInfoDto shainInfo) {
		this.shainInfo = shainInfo;
	}

	/**
	 * 社員情報を取得します。
	 * 
	 * @return 社員情報 shainInfo
	 */
	public ShainInfoDto getShainInfo() {
		return shainInfo;
	}
	
	/**
	 * 全社員リストを設定します。
	 * 
	 * @return 社員情報 shainInfoList
	 */
	public void setShainInfoList(List<ShainInfoDto> shainInfoList) {
		this.shainInfoList = shainInfoList;
	}
	
	/**
	 * 全社員リストを取得します。
	 * 
	 * @return 社員情報 shainInfoList
	 */
	public List<ShainInfoDto> getShainInfoList() {
		return shainInfoList;
	}
	
	/**
	 * メッセージを設定します。
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
	