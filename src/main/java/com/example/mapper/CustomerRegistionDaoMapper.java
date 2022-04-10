package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.CustomerDto;

@Mapper
public interface CustomerRegistionDaoMapper {
	
	//顧客情報をデータベースに登録
	public void register(CustomerDto cI);

}
