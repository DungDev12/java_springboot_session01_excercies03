package com.example.excercies03.productmanagement.service;

import com.example.excercies03.productmanagement.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Laptop", 25000000));
        products.add(new Product(2, "Chuột Logitech", 500000));
        products.add(new Product(3, "Bàn phím Keychron", 2200000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
