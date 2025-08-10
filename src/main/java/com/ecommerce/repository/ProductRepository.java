package com.ecommerce.repository;

import java.util.List;
import com.ecommerce.model.Product;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void update(Product product);
    void delete(int id);
}
