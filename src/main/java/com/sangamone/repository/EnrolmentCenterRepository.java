package com.sangamone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sangamone.model.EnrolmentCenter;

public interface EnrolmentCenterRepository extends JpaRepository<EnrolmentCenter, Integer> {
	@Query(value="select * from enrolment_center where center_id=:center_id",nativeQuery=true)
	EnrolmentCenter addUser(int center_id);
	
	
	@Transactional
	@Modifying
	@Query(value="update enrolment_center set status=:status where center_id=:center_id", nativeQuery=true)
	void approveCenter(@Param("center_id") int center_id, @Param("status") int status);

}
