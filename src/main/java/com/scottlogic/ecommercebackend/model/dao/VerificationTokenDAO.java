package com.scottlogic.ecommercebackend.model.dao;


import com.scottlogic.ecommercebackend.model.LocalUser;
import com.scottlogic.ecommercebackend.model.VerificationToken;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface VerificationTokenDAO extends ListCrudRepository<VerificationToken, Long> {
    Optional<VerificationToken> findByToken(String token);

    void deleteByUser(LocalUser user);
}
