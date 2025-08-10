package com.ecommerce.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ecommerce.model.Product;

@Repository
public class ProductDAO {
    private List<Product> products = new ArrayList<>();

    public ProductDAO() {
        products.add(new Product(1, "Laptop", 800));
        products.add(new Product(2, "Phone", 500));
    }

    public List<Product> getAll() { return products; }
    public Product getById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
    public void save(Product product) { products.add(product); }
    public void update(Product product) {
        Product existing = getById(product.getId());
        if (existing != null) {
            existing.setName(product.getName());
            existing.setPrice(product.getPrice());
        }
    }
    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}
