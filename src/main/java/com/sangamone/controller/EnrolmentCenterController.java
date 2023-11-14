package com.sangamone.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sangamone.dao.EnrolmentCenterDao;
import com.sangamone.model.EnrolmentCenter;


@RestController
public class EnrolmentCenterController {
	@Autowired
	EnrolmentCenterDao centerdao;
	
	@PostMapping("/addCenterDetails")
	public String addCenterDetails(@RequestBody EnrolmentCenter center){
		return centerdao.addCenterDetails(center)	;
	}
	
	@PutMapping("/approveCenter")
	public String approveCenter(@RequestBody EnrolmentCenter center) {
		return centerdao.approveCenter(center);
	}
	
	@PutMapping("/rejectCenter")
	public String rejectCenter(@RequestBody EnrolmentCenter center) {
		return centerdao.rejectCenter(center);
	}
	

	@GetMapping("/viewCentersDetails")
	public List<EnrolmentCenter> viewCentersDetails(){
		return centerdao.viewCenterDetails();
	}
	
	}
