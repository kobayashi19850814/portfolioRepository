package com.kkt.ems.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kkt.ems.dto.ShainInfoDto;

@Mapper
public interface EmployeeUpdateDaoMapper {
	public void updater(ShainInfoDto shainRegister);
}