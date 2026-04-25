package com.tcs.hibermate_crud_operation.controller;

import com.tcs.hibermate_crud_operation.dao.ProductDao;

public class DeleteProductbyPriceController {
	public static void main(String[] args) {
		
		ProductDao dao = new ProductDao();
		
		boolean a =dao.deleteProductByPriceDao(350);
		
		String msg = a?"deleted":"cheack your price";
		
		System.out.println(msg);
	}

}

