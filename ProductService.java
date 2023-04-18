package com.tender.proService;

import java.util.List;

import com.tender.entity.Product;

public interface ProductService {

	public void saveOneProduct(Product products);

	public List<Product> findAllPros();

	public void deleteById(long pid);

	public List findById(long pid);
}
