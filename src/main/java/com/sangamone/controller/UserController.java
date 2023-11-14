package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sangamone.dao.UserDao;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.EnrolmentCenterUser;
import com.sangamone.model.User;

@RestController
public class UserController {
	@Autowired
	UserDao userDao;
	
	@PostMapping("/addUserDetails")
	public String addUserDetails(@RequestBody EnrolmentCenterUser ecu) {
		return userDao.addUserDetails(ecu);
		
	}
	
	@GetMapping("/viewAllUserDetails")
	public List<User> viewAllUserDetails(){
		return userDao.viewAllUserDetails();
	}
	
	@GetMapping("/viewUserDetailsByCenterId/{center_id}")
	public List<User> viewUserDetailsByCenterId(@PathVariable("center_id") int center_id){ 
	return userDao.viewUserDetailsByCenterId(center_id);
}
}
