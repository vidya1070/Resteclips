package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.CourseEntity;
import com.example.demo.repositories.CourseRepo;
@Service
public class CourseService {
	@Autowired
	CourseRepo crepo;
	public List<CourseEntity> getAll(){
		return crepo.findAll();
		
	}

}
