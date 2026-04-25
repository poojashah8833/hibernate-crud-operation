package com.tcs.hibermate_crud_operation.controller;


import com.tcs.hibermate_crud_operation.dao.ProductDao;

public class GetAllProduct {
	public static void main(String[] args) {
		
		new ProductDao()
		.getAllProductDao()
		.forEach(System.out::println);
		
	}

}
