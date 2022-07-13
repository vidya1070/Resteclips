package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.ContacrEntities;
import com.example.demo.services.ContactService;


@RestController

public class ContactController {
	@Autowired
	ContactService cservice;
	@GetMapping("/allcons")
	public List<ContacrEntities> getAll(){
		return cservice.getAll();
		
	}
	@PostMapping("/savecon")
	public ContacrEntities saveCon(@RequestBody ContacrEntities ct) {
		return cservice.saveA(ct);
	}
	@GetMapping("/showcon")
	public List<ContacrEntities> getBylm(@RequestParam ("lname") String lm){
		return cservice.getByL(lm);
	}
@GetMapping	("/Update")
public int getByL(@RequestParam ("fname")String fs,@RequestParam("lname") String ls) {
	return cservice.Update(fs, ls);
}
}



