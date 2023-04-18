package com.tender.productController;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.tender.entity.Product;
import com.tender.proRepository.ProRepository;
import com.tender.proService.ProductService;

@RestController
@RequestMapping("/api/products")
public class PRestController {
	
		
		@Autowired
		private ProRepository proRepo;
		@Autowired
		private ProductService proSer;
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
		@ResponseStatus(value = HttpStatus.OK)
		@PostMapping("/upload")
		public void uploadImage(@RequestParam("products")MultipartFile file) throws IOException{
			proSer.uploadImage(file);
		}
		
		@GetMapping("/download/{fileName}")
		public ResponseEntity<byte[]> downloadImage(@PathVariable String fileName) {
			byte[] image = proSer.downloadImage(fileName);
			return ResponseEntity.status(HttpStatus.OK).contentType(MediaType.valueOf("image/png")).body(image);
		}

	}


