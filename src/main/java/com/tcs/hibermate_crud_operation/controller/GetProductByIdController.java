package com.tcs.hibermate_crud_operation.controller;

import com.tcs.hibermate_crud_operation.dao.ProductDao;
import com.tcs.hibermate_crud_operation.entity.Product;

public class GetProductByIdController {
	
	public static void main(String[] args) {
		Product product=new ProductDao().getProductByIdDao(88778);
		
		if(product!=null) {
			System.out.println(product);
		}else {
			System.out.println("something-went-wrong check your id");
		}
	}

}
