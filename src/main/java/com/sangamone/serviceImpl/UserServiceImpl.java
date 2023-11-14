package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sangamone.dao.UserDao;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.model.EnrolmentCenterUser;
import com.sangamone.model.User;
import com.sangamone.repository.EnrolmentCenterRepository;
import com.sangamone.repository.UserRepo;
@Service
public class UserServiceImpl implements UserDao {
	@Autowired
	UserRepo userRepo;
	@Autowired
	EnrolmentCenterRepository ecuRepo;

	@Override
	public String addUserDetails(EnrolmentCenterUser ecu) {
		String result="Enrolment Center Not Found";
		EnrolmentCenter ec=ecuRepo.addUser(ecu.getCenter_id());
		if(ec!=null) {
			User user=new User();
			user.setName(ecu.getName());
			user.setPhone_number(ecu.getPhone_number());
			user.setAadhar(ecu.getAadhar());
			user.setEmail(ecu.getEmail());
			user.setCenter_id(ec.getCenter_id());

			userRepo.save(user);
			result="User Details added successfully";
		}
		return result;
	}

	@Override
	public List<User> viewAllUserDetails() {
		return userRepo.findAll();
	}

	@Override
	public List<User> viewUserDetailsByCenterId(int center_id) {
		return userRepo.viewUserDetailsByCenterId(center_id);
	}
}
