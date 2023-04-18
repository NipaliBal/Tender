package com.tender.productController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tender.entity.Product;
import com.tender.proRepository.ProRepository;

@RestController
@RequestMapping("/api/products")
public class PRestController {
	
		
		@Autowired
		private ProRepository proRepo;
		
		@GetMapping                            //getmapping will automatically convert java object to json object
		public List<Product> getAllLeads(){
			List<Product> products = proRepo.findAll();//it will return java object.
			return products;
			//GetMapping will get all the record from database as a java object.
		}

	@PostMapping
	public void saveLead(@RequestBody Product products){
		proRepo.save(products);
		}
		
	@PutMapping
	public void updateLead(@RequestBody Product products){
		proRepo.save(products);
		}
		
		@DeleteMapping("/delete/{id}")
		public void deleteLead(@PathVariable("pid") long pid) {
			proRepo.deleteById(pid);
		}

	}


