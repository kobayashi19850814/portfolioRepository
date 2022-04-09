package com.kkt.ems.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kkt.ems.dto.ShainInfoDto;

@Mapper
public interface ShainInfoChartDaoMapper {
	public List<ShainInfoDto> chart();
}
