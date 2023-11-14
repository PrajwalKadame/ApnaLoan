package com.sangamone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int admin_id;
	@Column(nullable=false)
	private String admin_name;
	@Column(nullable=false)
	private String admin_phone_number;
	private String admin_email;
	@Column(nullable=false)
	private String admin_aadhar;
	private int center_id;
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
	public String getAdmin_aadhar() {
		return admin_aadhar;
	}
	public void setAdmin_aadhar(String admin_aadhar) {
		this.admin_aadhar = admin_aadhar;
	}
	public int getCenter_id() {
		return center_id;
	}
	public void setCenter_id(int center_id) {
		this.center_id = center_id;
	}
	
	

}
