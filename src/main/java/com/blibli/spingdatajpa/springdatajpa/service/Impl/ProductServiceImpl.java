package com.blibli.spingdatajpa.springdatajpa.service.Impl;

import com.blibli.spingdatajpa.springdatajpa.entity.Product;
import com.blibli.spingdatajpa.springdatajpa.entity.Shop;
import com.blibli.spingdatajpa.springdatajpa.repository.ProductRepository;
import com.blibli.spingdatajpa.springdatajpa.repository.ShopRepository;
import com.blibli.spingdatajpa.springdatajpa.service.ProductService;
import com.blibli.spingdatajpa.springdatajpa.web.model.CreateProductRequest;
import com.blibli.spingdatajpa.springdatajpa.web.model.FilterProductRequest;
import com.blibli.spingdatajpa.springdatajpa.web.model.UpdateProductRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ShopRepository shopRepository;

    @Override
    public Product create(CreateProductRequest request) {
        Shop shop = shopRepository.getById(request.getShopId());
        Product product = Product.builder().shopId(shop).build();
        BeanUtils.copyProperties(request, product);

        return productRepository.save(product);
    }

    @Override
    public Product findById(String id) {
        return productRepository.getById(id);
    }

    @Override
    public Page<Product> findByFilter(FilterProductRequest request){
        return productRepository.findByFilter(request);
    }

    public Product update(String id, UpdateProductRequest request) {
        Product product = productRepository.getById(id);
        BeanUtils.copyProperties(request, product);
        if(!request.getShopId().equals(product.getShopId().getId())) {
            Shop shop = shopRepository.getById(request.getShopId());
            product.setShopId(shop);
        }
        return productRepository.save(product);
//        productRepository.save(product);

//        if(true) {
//            throw new RuntimeException("Test Rollback");
//        } else {
//            return null;
//        }
    }

    @Override
    public void deleteById(String id) {
        productRepository.deleteById(id);
    }
}
