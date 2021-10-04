package com.eletronics.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronics.books.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
