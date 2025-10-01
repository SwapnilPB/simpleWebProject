package com.swap.simpleWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swap.simpleWebApp.model.Product;
import com.swap.simpleWebApp.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repo;

//	List<Product> products = new ArrayList<>(
//			Arrays.asList(new Product(101, "iPhone", 10), new Product(102, "Camera", 10), new Product(103, "Mic", 10)));

	public List<Product> getProducts() {
		return repo.findAll();
	}

	public Product getProductById(int prodId) {
		return repo.findById(prodId).orElse(new Product());
	}

	public void addproduct(Product prod) {
		repo.save(prod);
	}

	public void updateProduct(Product prod) {
		repo.save(prod);
	}

	public void deleteProduct(int prodId) {
		Product product = repo.findById(prodId).orElse(new Product());
		repo.delete(product);
	}

}
