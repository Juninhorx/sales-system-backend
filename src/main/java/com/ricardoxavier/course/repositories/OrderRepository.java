package com.ricardoxavier.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoxavier.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
