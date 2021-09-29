package com.eletronics.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronics.books.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
