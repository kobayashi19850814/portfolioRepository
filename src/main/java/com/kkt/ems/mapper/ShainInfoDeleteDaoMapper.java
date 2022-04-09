package com.kkt.ems.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShainInfoDeleteDaoMapper {
	public void delete(String shainNo);	
}
