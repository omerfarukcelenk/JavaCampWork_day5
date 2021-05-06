package com.company.business.abstracts;

import com.company.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
