package com.techrat.OrderApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techrat.OrderApp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
