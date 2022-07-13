package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.CourseEntity;
import com.example.demo.service.CourseService;

@RestController
public class CourseController {
@Autowired
CourseService cservice;
@GetMapping("/allcourse")
public List<CourseEntity> getAll(){
	return cservice.getAll();
	
}
}
