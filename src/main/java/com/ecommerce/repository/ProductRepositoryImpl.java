package com.ecommerce.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.ecommerce.model.Product;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private static List<Product> products = new ArrayList<>();
    private static int idCounter = 1;

    static {
        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Phone", 20000));
        idCounter = 3;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(int id) {
        return products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void save(Product product) {
        product.setId(idCounter++);
        products.add(product);
    }

    @Override
    public void update(Product product) {
        delete(product.getId());
        products.add(product);
    }

    @Override
    public void delete(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}
