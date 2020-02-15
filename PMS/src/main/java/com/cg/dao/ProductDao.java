package com.cg.dao;

import java.util.List;

import com.cg.demo.Product;
import com.cg.exception.ProductException;

public interface ProductDao {
	public int addproduct(Product product) throws ProductException;
	public Product findProductById(int productId) throws ProductException;
	public Product deleteProductById(int productId) throws ProductException;
	  public List<Product >findAllEmployee() throws ProductException;

	}

	


