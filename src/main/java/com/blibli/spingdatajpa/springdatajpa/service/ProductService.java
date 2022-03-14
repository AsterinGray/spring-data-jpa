package com.blibli.spingdatajpa.springdatajpa.service;

import com.blibli.spingdatajpa.springdatajpa.entity.Product;
import com.blibli.spingdatajpa.springdatajpa.web.model.CreateProductRequest;
import com.blibli.spingdatajpa.springdatajpa.web.model.FilterProductRequest;
import com.blibli.spingdatajpa.springdatajpa.web.model.UpdateProductRequest;
import org.springframework.data.domain.Page;

public interface ProductService {
    Product create(CreateProductRequest request);
    Product findById(String id);
    Page<Product> findByFilter(FilterProductRequest request);
    Product update(String id, UpdateProductRequest request);
    void deleteById(String id);
}
