package com.scottlogic.ecommercebackend.model.dao;

import com.scottlogic.ecommercebackend.model.LocalUser;
import com.scottlogic.ecommercebackend.model.WebOrder;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {
    List<WebOrder> findByUser(LocalUser user);
}
