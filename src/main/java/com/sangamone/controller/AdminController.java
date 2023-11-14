package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.AdminDao;
import com.sangamone.model.Admin;
import com.sangamone.model.EnrolmentCenterUser;
import com.sangamone.model.User;

@RestController
public class AdminController {
	@Autowired
	AdminDao dao;
	
	@PostMapping("/addAdminDetails")
	public String addAdminDetails(@RequestBody Admin admin) {
		return dao.addAdminDetails(admin);
		
	}
	
	@GetMapping("/viewAllAdminDetails")
	public List<Admin> viewAllAdminDetails(){
		return dao.viewAllAdminDetails();
	}
	
	@GetMapping("/viewAdminDetailsByCenterId/{center_id}")
	public List<Admin> viewAdminDetailsByCenterId(@PathVariable("center_id") int center_id){ 
	return dao.viewAdminDetailsByCenterId(center_id);
}

}
