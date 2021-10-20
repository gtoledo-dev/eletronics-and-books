package com.eletronics.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronics.books.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
