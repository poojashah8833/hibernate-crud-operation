package com.tcs.hibermate_crud_operation.controller;

import java.time.LocalDate;

import com.tcs.hibermate_crud_operation.dao.ProductDao;
import com.tcs.hibermate_crud_operation.entity.Product;

public class InsertProductController {

	public static void main( String[] args )
    {
      
        Product product = new Product();
        
        product.setId(88779);
        product.setName("earbuds");
        product.setColor("white");
        product.setMfd(LocalDate.parse("2025-09-09"));
        product.setExpd(LocalDate.parse("2026-09-09"));
        product.setPrice(350);
        
        ProductDao dao = new ProductDao();
        
        dao.saveProductDao(product);
        
    }
}
