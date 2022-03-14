package com.blibli.spingdatajpa.springdatajpa.repository;

import com.blibli.spingdatajpa.springdatajpa.entity.Product;
import com.blibli.spingdatajpa.springdatajpa.web.model.FilterProductRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCustomRepository {
    Page<Product> findByFilter(FilterProductRequest request);
}
