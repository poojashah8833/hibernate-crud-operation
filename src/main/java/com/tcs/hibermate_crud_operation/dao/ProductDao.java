package com.tcs.hibermate_crud_operation.dao;

import java.util.List;

import com.tcs.hibermate_crud_operation.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class ProductDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");

	EntityManager em = emf.createEntityManager();

	EntityTransaction et = em.getTransaction();

	public Product saveProductDao(Product product) {

		System.out.println(product);
		et.begin();
		em.persist(product);
		et.commit();
		return product;
	}

	public Product getProductByIdDao(int id) {

		Product product = em.find(Product.class, id);

		return product;
	}

	public boolean deleteProductByIdDao(int id) {

		Product product = em.find(Product.class, id);

		if (product != null) {

			et.begin();

			em.remove(product);

			et.commit();

			return true;
		}

		return false;
	}

	public Product updateProductPriceByIdDao(int id, double price) {

		Product product = em.find(Product.class, id);

		if (product != null) {

			et.begin();

			product.setPrice(price);

			em.merge(product);

			et.commit();

			return product;
		}

		return null;
	}
	
	public List<Product> getProductByColorDao(String color)
	{
		String getProductByColorQuery = "select p from Product p where p.color=?1";
		
		Query query=em.createQuery(getProductByColorQuery, Product.class );
		
		query.setParameter(1, color);
		
		return query.getResultList();
		
	
	}
	
	public List<Product> getAllProductDao()
	{
		
		String getAllProductQuery = "from Product";
		
		Query query = em.createQuery(getAllProductQuery,Product.class);
		
		return query.getResultList();
	
	}
	
	public boolean deleteProductByPriceDao(double price)
	{
		String deleteProductByPriceQuery = "delete from Product p where p.price=?1";
				
		Query query = em.createQuery(deleteProductByPriceQuery);
		query.setParameter(1, price);
		
		et.begin();
        
		int a = query.executeUpdate();
		
		et.commit();
		
		if(a!=0) {
			return true;
		}
		
		return false;
	}
	
}


