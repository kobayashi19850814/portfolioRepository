package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.CustomerDto;

@Mapper
public interface CustomerSearchAllDaoMapper {
	
	// 全顧客の一覧を取得
	public List<CustomerDto> searchAll();

}
