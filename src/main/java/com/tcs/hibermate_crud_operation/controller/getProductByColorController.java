package com.tcs.hibermate_crud_operation.controller;

import java.util.List;

import com.tcs.hibermate_crud_operation.dao.ProductDao;
import com.tcs.hibermate_crud_operation.entity.Product;

public class getProductByColorController {
	
	public static void main(String[] args) {
List<Product> products=new ProductDao().getProductByColorDao("white");
		
		if(products.size()>0) {
			products.forEach(a->System.out.println(a));
		}else {
			System.out.println("given color not avaialable");
		}
		
	}

	

}
