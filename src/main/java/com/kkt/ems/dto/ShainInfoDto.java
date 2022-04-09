package com.kkt.ems.dto;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ShainInfoDto {
	/** 社員番号 */
	private String shainNo;
	/** 社員名(漢字) */
	private String shainNameKj;
	/** 社員名(カナ) */
	private String shainNameKn;
	/** 部署名 */
	private String bushoName;
	/** 全社員リスト */
	private List<ShainInfoDto> shainInfoDto;
	
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
	 */
	public void setShainNameKj(String shainNameKj) {
		this.shainNameKj = shainNameKj;
	}
	/**
	 * 社員名(漢字)を取得します。
	 *
	 * @return 社員名(漢字) shainNameKj
	 */
	public String getShainNameKj() {
		return shainNameKj;
	}
	/**
	 * 社員名(カナ)を設定します。
	 *
	 * @param 社員名(カナ) shainNameKn
	 */
	public void setShainNameKn(String shainNameKn) {
		this.shainNameKn = shainNameKn;
	}
	/**
	 * 社員名(カナ)を取得します。
	 *
	 * @return 社員名(カナ) shainNameKn
	 */
	public String getShainNameKn() {
		return shainNameKn;
	}
	/**
	 * 部署名を設定します。
	 *
	 * @param 部署名 bushoName
	 */
	public void setBushoName(String bushoName) {
		this.bushoName = bushoName;
	}
	/**
	 * 部署名を取得します。
	 *
	 * @return 部署名 bushoName
	 */
	public String getBushoName() {
		return bushoName;
	}
	
	/**
	 * 全社員リストを設定します。
	 *
	 * @param 部署名 shainInfoDto
	 */
	public void setShainInfoDto(List<ShainInfoDto> shainInfoDto) {
		this.shainInfoDto = shainInfoDto;
	}	
	
	/**
	 * 全社員リストを取得します。
	 *
	 * @return 部署名 shainInfoDto
	 */
	public List<ShainInfoDto> getShainInfoDto() {
		return shainInfoDto;
	}
	
	
	
}