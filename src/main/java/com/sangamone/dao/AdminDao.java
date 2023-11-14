package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.Admin;


public interface AdminDao {

	String addAdminDetails(Admin eca);

	List<Admin> viewAllAdminDetails();

	List<Admin> viewAdminDetailsByCenterId(int center_id);

	

}
