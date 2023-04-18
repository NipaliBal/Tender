package com.tender.proService;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.tender.entity.Product;

public interface ProductService {

	public void saveOneProduct(Product products);

	public List<Product> findAllPros();

	public void deleteById(long pid);

	public List findById(long pid);
	public Product uploadImage(MultipartFile file) throws IOException;
	public byte[] downloadImage(String fileName);
}
