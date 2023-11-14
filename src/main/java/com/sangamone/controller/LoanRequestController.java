package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanRequestDao;
import com.sangamone.model.CenterUserProductLoanRequest;
import com.sangamone.model.LoanRequest;

@RestController

public class LoanRequestController {
	@Autowired
	LoanRequestDao dao;
	
	@PostMapping("/addLoanRequest")
	public String addLoanRequest(@RequestBody CenterUserProductLoanRequest cuplr)
	{
		return dao.addLoanRequest(cuplr);	
	}
	
	@GetMapping("/viewLoanRequest")
	public List<LoanRequest> viewLoanRequest(){
		return dao.viewLoanRequest();
	} 
	

}
