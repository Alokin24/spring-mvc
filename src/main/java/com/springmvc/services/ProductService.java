package com.springmvc.services;

import com.springmvc.domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAllProducts();

    Product getProduct(Integer id);
}
