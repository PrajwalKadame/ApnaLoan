package com.sangamone.dao;

import java.util.List;

import com.sangamone.model.LoanProduct;

public interface LoanProductDao {

	String addProduct(LoanProduct loanproduct);

	List<LoanProduct> viewAllLoanProducts();

}
