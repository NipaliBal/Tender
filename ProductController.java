package com.tender.productController;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.MultipartFile;

import com.tender.entity.Product;
import com.tender.proService.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService proSer;
	@RequestMapping("/createViewPro")
	public String proViewCreate() {
		return "enter_product";
	}
	@RequestMapping("/savePro")
	public String saveOnePro(@ModelAttribute("products")Product products,Model model) {
		proSer.saveOneProduct(products);
		model.addAttribute("msg","saved product details");
		return "enter_product";
	}
	
	@RequestMapping("/listAll")
	public String listAllProducts(@RequestParam("pid") Long pid,Model model) {
		List<Product> products=proSer.findAllPros();
		model.addAttribute("products",products);
		return "list_product";
	}
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("pid") long pid,Model model) {
		proSer.deleteById(pid);
		List<Product> products=proSer.findAllPros();
		model.addAttribute("products",products);
		return "list_product";
	
	}
	@RequestMapping("/update")
	public String deleteById1(@RequestParam("pid") long pid,Model model) {
		proSer.findById(pid);
		List<Product> products=proSer.findAllPros();
		model.addAttribute("products",products);
		return "update_product";
	
	}

	}
