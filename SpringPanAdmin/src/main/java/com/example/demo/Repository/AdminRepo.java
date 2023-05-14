package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Admin;

@Repository
public interface AdminRepo  extends JpaRepository<Admin, Long> {

	@Query(value = "select * from  admin where Admin_Email = ?1" , nativeQuery = true)
	public Admin findByEmail(String email);
	
	@Query(value = "select * from  admin where Admin_Email = ?1 and Admin_Password= ?2" , nativeQuery = true)
	public Admin findByemailpassword(String email ,String password);
	
	
	
}
