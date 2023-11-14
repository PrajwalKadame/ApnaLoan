package com.sangamone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sangamone.dao.LoanProductDao;
import com.sangamone.model.LoanProduct;

@RestController
public class LoanProductController {
	@Autowired
	LoanProductDao loanproductDao;
	
	@PostMapping("/addLoanProduct")
	public String addProduct(@RequestBody LoanProduct loanproduct) {
		return loanproductDao.addProduct(loanproduct);
	}
	
	@GetMapping("/viewAllLoanProducts")
	public List<LoanProduct> viewAllLoanProducts(){
		return loanproductDao.viewAllLoanProducts();
	}

}
