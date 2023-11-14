package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{

	@Query(value="select * from admin where center_id=:center_id", nativeQuery=true)
	List<Admin> viewAdminDetailsByCenterId(@Param("center_id") int center_id);

}
