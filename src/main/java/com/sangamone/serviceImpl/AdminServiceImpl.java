package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.AdminDao;
import com.sangamone.model.Admin;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.User;
import com.sangamone.repository.AdminRepo;
import com.sangamone.repository.EnrolmentCenterRepository;

@Service
public class AdminServiceImpl implements AdminDao{
	@Autowired
	AdminRepo repo;
	
	@Autowired
	EnrolmentCenterRepository ecuRepo;

	@Override
	public String addAdminDetails(Admin eca) {
		String result="Enrolment Center Not Found";
		EnrolmentCenter ec=ecuRepo.addUser(eca.getCenter_id());
		if(ec!=null) {
			Admin admin=new Admin();
			admin.setAdmin_name(eca.getAdmin_name());
			admin.setAdmin_email(eca.getAdmin_email());
			admin.setAdmin_phone_number(eca.getAdmin_phone_number());
			admin.setAdmin_aadhar(eca.getAdmin_aadhar());
			admin.setCenter_id(ec.getCenter_id());

			repo.save(admin);
			result="User Details added successfully";
		}
		return result;
	}

	@Override
	public List<Admin> viewAllAdminDetails() {
		return repo.findAll();
	}

	@Override
	public List<Admin> viewAdminDetailsByCenterId(int center_id) {
		return repo.viewAdminDetailsByCenterId(center_id);
	}
	

	

}
