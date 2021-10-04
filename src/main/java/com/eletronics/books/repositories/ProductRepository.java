package com.eletronics.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronics.books.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
