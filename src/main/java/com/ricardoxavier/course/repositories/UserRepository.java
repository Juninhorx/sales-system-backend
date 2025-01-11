package com.ricardoxavier.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ricardoxavier.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
