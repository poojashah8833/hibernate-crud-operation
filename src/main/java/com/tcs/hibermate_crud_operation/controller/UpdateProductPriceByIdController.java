package com.tcs.hibermate_crud_operation.controller;

import com.tcs.hibermate_crud_operation.dao.ProductDao;
import com.tcs.hibermate_crud_operation.entity.Product;

public class UpdateProductPriceByIdController {
	
public static void main(String[] args) {
		
		Product product=new ProductDao().updateProductPriceByIdDao(88777, 690);
	
		System.out.println("updated product price is below");
		
		System.out.println(product);
		
		
	}
	

}
