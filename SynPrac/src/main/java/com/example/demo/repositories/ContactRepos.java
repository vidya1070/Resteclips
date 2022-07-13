package com.example.demo.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ContacrEntities;
@Transactional
@Repository

public interface ContactRepos extends JpaRepository<ContacrEntities, Integer> {
	@Query("select c from ContacrEntities c where lname=:ln")
	public List<ContacrEntities> getByLname(String ln);
	@Modifying
	@Query("update ContacrEntities set fname=?1 where lname=?2")
public int UpdateName(String fnm,String lnm);
}
