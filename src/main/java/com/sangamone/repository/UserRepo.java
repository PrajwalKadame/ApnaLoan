package com.sangamone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sangamone.model.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	@Query(value="select * from user where center_id=:center_id", nativeQuery=true)
	List<User> viewUserDetailsByCenterId(int center_id);

	@Query(value="select * from user where user_id=:user_id", nativeQuery=true)
	User addRequest(@Param("user_id") int user_id);

}
