package com.cg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.demo.Product;
import com.cg.exception.ProductException;

public class ProdouctDaoImpl implements ProductDao{
	private Map<Integer,Product> map;
	public ProdouctDaoImpl()
	{
		map=new HashMap<Integer,Product>();
	}

	public int addproduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		boolean flag=map.containsKey(product.getProductId());
		if(flag)
		{
			throw new ProductException("id not Exist");
		}
		else
		{
			map.put(product.getProductId(),product);
		}
		
		return product.getProductId();
	}

	public Product findProductById(int productId) throws ProductException {
		// TODO Auto-generated method stub
		boolean flag=map.containsKey(productId);
		Product product=null;
		if(flag)
		{
			product=map.get(productId);
		}
		else
		{
			throw new ProductException("id not found");
		}
		return product;
		
		
		
		

	}

	public Product deleteProductById(int productId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Product> findAllEmployee() throws ProductException {
		// TODO Auto-generated method stub
		Collection<Product> col=map.values();
		List<Product> list=new ArrayList<Product>(col);
		
		return list;
	}

}
