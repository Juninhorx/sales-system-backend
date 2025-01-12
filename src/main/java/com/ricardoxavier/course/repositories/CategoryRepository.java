package com.ricardoxavier.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoxavier.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
}
