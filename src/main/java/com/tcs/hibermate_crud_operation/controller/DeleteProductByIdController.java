package com.tcs.hibermate_crud_operation.controller;

import com.tcs.hibermate_crud_operation.dao.ProductDao;

public class DeleteProductByIdController {

	public static void main(String[] args) {
		boolean b=new ProductDao().deleteProductByIdDao(88779);
		
		String sg=b?"deleted":"check id not deleted";
		System.out.println(sg);
	}
}
