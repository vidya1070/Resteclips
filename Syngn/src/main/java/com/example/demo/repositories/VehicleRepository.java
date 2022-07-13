package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entitities.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer > {
	@Query("select v from Vehicle v where vname=:nm")
public List<Vehicle> getByname(String nm);
	
	
}
