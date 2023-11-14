package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanRequestDao;
import com.sangamone.model.CenterUserProductLoanRequest;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.LoanProduct;
import com.sangamone.model.LoanRequest;
import com.sangamone.model.User;
import com.sangamone.repository.EnrolmentCenterRepository;
import com.sangamone.repository.LoanProductRepo;
import com.sangamone.repository.LoanRequestRepo;
import com.sangamone.repository.UserRepo;

@Service
public class LoanRequestServiceImpl implements LoanRequestDao{
	@Autowired
	LoanRequestRepo repo;
	
	@Autowired
	EnrolmentCenterRepository ecr;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	LoanProductRepo loanProductRepo;

	@Override
	public String addLoanRequest(CenterUserProductLoanRequest cuplr) {
		String result="Details Not Found";
		EnrolmentCenter ec=ecr.addUser(cuplr.getCenter_id());
		User user=userRepo.addRequest(cuplr.getUser_id());
		LoanProduct loanProduct=loanProductRepo.addRequest(cuplr.getProduct_id());
		if(ec!=null && user!=null && loanProduct!=null) {
			LoanRequest loanRequest=new LoanRequest();
			loanRequest.setCenter_id(ec.getCenter_id());
			loanRequest.setUser_id(user.getUser_id());
			loanRequest.setProduct_id(loanProduct.getProduct_id());
			
			repo.save(loanRequest);
			result="LoanRequest added successfully";
		}
		return result;
		
		
	}

	@Override
	public List<LoanRequest> viewLoanRequest() {
		
		return repo.findAll();
	}

}
