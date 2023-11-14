package com.sangamone.model;

import javax.persistence.Column;

public class EnrollmentCenterAdmin {
	private int center_id;
	private String center_name;
	private String center_location;
	private int status;
	private int admin_id;
	private String admin_name;
	private String admin_phone_number;
	private String admin_email;
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	public String getCenter_name() {
		return center_name;
	}
	public void setCenter_name(String center_name) {
		this.center_name = center_name;
	}
	public String getCenter_location() {
		return center_location;
	}
	public void setCenter_location(String center_location) {
		this.center_location = center_location;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_phone_number() {
		return admin_phone_number;
	}
	public void setAdmin_phone_number(String admin_phone_number) {
		this.admin_phone_number = admin_phone_number;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	
	

}
