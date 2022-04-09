package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.CustomerDto;

@Mapper
public interface CustomerDaoMapper {

	public CustomerDto search(String id);
	
}
