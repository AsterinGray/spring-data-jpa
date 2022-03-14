package com.blibli.spingdatajpa.springdatajpa.repository;

import com.blibli.spingdatajpa.springdatajpa.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository extends JpaRepository<Shop, String> {

}
