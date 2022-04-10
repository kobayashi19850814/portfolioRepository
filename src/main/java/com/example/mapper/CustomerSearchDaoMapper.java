package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.CustomerDto;

@Mapper
public interface CustomerSearchDaoMapper {

	//1人を取得
	public CustomerDto search(String id);
	
}
