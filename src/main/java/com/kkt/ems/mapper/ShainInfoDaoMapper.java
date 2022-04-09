package com.kkt.ems.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kkt.ems.dto.ShainInfoDto;

@Mapper
public interface ShainInfoDaoMapper {
	public ShainInfoDto select(String shainNo);
}
