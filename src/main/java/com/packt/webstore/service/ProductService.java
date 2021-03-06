package com.packt.webstore.service;
import com.packt.webstore.domain.Product;
import java.util.List;

public interface ProductService {
	public abstract List<Product> getAllProducts();
	abstract Product getProductById(String productID);
}
