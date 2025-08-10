package com.ecommerce.service;

import com.ecommerce.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void save(Product product);
    void delete(int id); // ✅ add this
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(int id);
}
