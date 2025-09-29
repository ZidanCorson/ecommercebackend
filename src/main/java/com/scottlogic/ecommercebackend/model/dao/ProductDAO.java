package com.scottlogic.ecommercebackend.model.dao;

import com.scottlogic.ecommercebackend.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
