package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.LoanDao;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.Loan;
import com.sangamone.model.LoanProduct;
import com.sangamone.model.LoanRequest;
import com.sangamone.model.User;
import com.sangamone.model.UserProductLoan;
import com.sangamone.repository.EnrolmentCenterRepository;
import com.sangamone.repository.LoanProductRepo;
import com.sangamone.repository.LoanRepo;
import com.sangamone.repository.UserRepo;

@Service
public class LoanServiceImpl implements LoanDao {
	@Autowired
	LoanRepo loanrepo;
	
	@Autowired
	EnrolmentCenterRepository ecr;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	LoanProductRepo loanProductRepo;

	@Override
	public String addLoanDetails(UserProductLoan loan) {
		String result="Details Not Found";
		EnrolmentCenter ec=ecr.addUser(loan.getCenter_id());
		User user=userRepo.addRequest(loan.getUser_id());
		LoanProduct loanProduct=loanProductRepo.addRequest(loan.getProduct_id());
		if(ec!=null && loanProduct!=null) {
			Loan loan1=new Loan();
			loan1.setCenter_id(ec.getCenter_id());
			loan1.setFrom_user_id(user.getUser_id());
			loan1.setTo_user_id(user.getUser_id());
			loan1.setProduct_id(loanProduct.getProduct_id());
			loan1.setCommission(loan.getCommission());
			
			loanrepo.save(loan1);
			result="Loan Sanction Details added successfully";
		}
		return result;
	}

	@Override
	public List<Loan> viewLoanDetails() {
		return loanrepo.findAll();
	}

	@Override
	public List<Loan> viewLoanDetailsByUserId(int from_user_id, int to_user_id) {
		return loanrepo.viewLoanDetailsByUserId(from_user_id,to_user_id);
	}

	@Override
	public List<Loan> viewLoanDetailsByCenterId(int center_id) {
		
		return loanrepo.viewLoanDetailsByCenterId(center_id);
	}

}
