package com.sangamone.dao;

import java.util.List;
import com.sangamone.model.EnrolmentCenterUser;
import com.sangamone.model.User;

public interface UserDao {

	String addUserDetails(EnrolmentCenterUser ecu);

	List<User> viewAllUserDetails();

	List<User> viewUserDetailsByCenterId(int center_id);

}
