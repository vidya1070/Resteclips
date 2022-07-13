package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entitities.Vehicle;
import com.example.demo.repositories.VehicleRepository;

@Service
public class VehicleService {
	@Autowired
	VehicleRepository vrepo;
	public List<Vehicle> getAll(){
		return vrepo.findAll();
		
		
	}
	public Vehicle savev(Vehicle v) {
return vrepo.save(v);
}
	public List<Vehicle> getByN(String vc)
	{
		return vrepo.getByname(vc);
	}
}