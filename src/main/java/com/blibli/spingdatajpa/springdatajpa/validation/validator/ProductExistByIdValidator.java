package com.blibli.spingdatajpa.springdatajpa.validation.validator;

import com.blibli.spingdatajpa.springdatajpa.repository.ProductRepository;
import com.blibli.spingdatajpa.springdatajpa.validation.ProductExist;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProductExistByIdValidator implements ConstraintValidator<ProductExist, String> {
    @Autowired
    ProductRepository productRepository;

    @Override
    public boolean isValid(String id, ConstraintValidatorContext constraintValidatorContext) {
        return productRepository.existsById(id);
    }


}
