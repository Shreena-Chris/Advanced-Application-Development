package com.party.EventEase.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.party.EventEase.model.User;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
