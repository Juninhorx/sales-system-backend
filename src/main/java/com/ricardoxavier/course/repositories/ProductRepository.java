package com.ricardoxavier.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.ricardoxavier.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
}
