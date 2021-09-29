package com.eletronics.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronics.books.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
