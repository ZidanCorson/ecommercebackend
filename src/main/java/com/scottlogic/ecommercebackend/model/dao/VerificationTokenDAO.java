package com.scottlogic.ecommercebackend.model.dao;


import com.scottlogic.ecommercebackend.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
}
