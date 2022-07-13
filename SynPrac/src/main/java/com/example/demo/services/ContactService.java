package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.ContacrEntities;
import com.example.demo.repositories.ContactRepos;

@Service
public class ContactService {
@Autowired
	ContactRepos crepo;
public List<ContacrEntities> getAll(){
	return crepo.findAll();
	
	
}
public ContacrEntities saveA(ContacrEntities c) {
	return crepo.save(c);
}
public List<ContacrEntities> getByL(String lm){
	return crepo.getByLname(lm);
}
public int Update(String f,String l) {
	return crepo.UpdateName(f, l);
}
}
