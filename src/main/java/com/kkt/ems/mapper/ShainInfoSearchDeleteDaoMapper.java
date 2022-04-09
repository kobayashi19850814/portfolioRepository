package com.kkt.ems.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShainInfoSearchDeleteDaoMapper {
	public void deleteByShainNo(String shainNo);
}
