package com.tender.proService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tender.entity.Product;
import com.tender.proRepository.ProRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProRepository proRepo;
	@Override
	public void saveOneProduct(Product products) {
		proRepo.save(products);
	}
	@Override
	public List<Product> findAllPros() {
		List<Product> pros=proRepo.findAll();
		return pros;
	}
	@Override
	public void deleteById(long pid) {
		proRepo.deleteById(pid);
	}
	@Override
	public List findById(long pid) {
		Optional<Product> findById = proRepo.findById(pid);
		List<Product> products=(List<Product>) findById.get();
		return products;
	}

}
