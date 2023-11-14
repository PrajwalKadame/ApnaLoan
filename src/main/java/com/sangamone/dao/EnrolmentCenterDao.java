package com.sangamone.dao;

import java.util.List;
import com.sangamone.model.EnrolmentCenter;

public interface EnrolmentCenterDao {

	String addCenterDetails(EnrolmentCenter center);

	List<EnrolmentCenter> viewCenterDetails();
	
	EnrolmentCenter viewUserDetailsByCenterId(int center_id);

	String approveCenter(EnrolmentCenter center);

	String rejectCenter(EnrolmentCenter center);



}
