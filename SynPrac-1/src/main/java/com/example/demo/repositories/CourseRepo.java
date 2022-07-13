package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.CourseEntity;
@Repository
public interface CourseRepo extends JpaRepository<CourseEntity, Integer> {
	

}
