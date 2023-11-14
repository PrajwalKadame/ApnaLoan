package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanProductDao;
import com.sangamone.model.LoanProduct;
import com.sangamone.repository.LoanProductRepo;
@Service
public class LoanProductServiceImpl implements LoanProductDao{
	@Autowired
	LoanProductRepo loanproductRepo;

	@Override
	public String addProduct(LoanProduct loanproduct) {
		loanproductRepo.save(loanproduct);
		return "Loan Product Added Successfully";
	}

	@Override
	public List<LoanProduct> viewAllLoanProducts() {
		return loanproductRepo.findAll();
	}
	

}
