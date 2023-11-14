package com.sangamone.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangamone.dao.EnrolmentCenterDao;
import com.sangamone.model.EnrolmentCenter;
import com.sangamone.repository.EnrolmentCenterRepository;

@Service
public class EnrolmentCenterServiceImpl implements EnrolmentCenterDao{
	@Autowired
	EnrolmentCenterRepository centerrepo;

	@Override
	public String addCenterDetails(EnrolmentCenter center) {
		centerrepo.save(center);
		return "Center Details Added Successfully";
	}

	@Override
	public List<EnrolmentCenter> viewCenterDetails() {
		
		return centerrepo.findAll();
	}
	
	@Override
	public EnrolmentCenter viewUserDetailsByCenterId(int center_id) {
		return centerrepo.findById(center_id).get();
	}

	@Override
	public String approveCenter(EnrolmentCenter center) {
		centerrepo.save(center);
		return "Center approved";
	}

	@Override
	public String rejectCenter(EnrolmentCenter center) {
		centerrepo.save(center);
		return "Center rejected";
	}

}
