package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitities.Vehicle;
import com.example.demo.services.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService vservice;
	@GetMapping("/getvehi")
	public List<Vehicle> Ser(){
		return vservice.getAll();
		
		
	}
	@PostMapping("/savevehi")
	public Vehicle SaveAll(@RequestBody Vehicle vt ) {
		return vservice.savev(vt);
	}
	@GetMapping("/getby")
	public List<Vehicle> getBynm(@RequestParam("nm") String nt){
		return vservice.getByN(nt);
	}
}
