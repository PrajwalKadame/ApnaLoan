package com.sangamone.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LoanRequest {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int loan_request_id;
private int user_id;
private int center_id;
private int product_id;
public int getLoan_request_id() {
	return loan_request_id;
}
public void setLoan_request_id(int loan_request_id) {
	this.loan_request_id = loan_request_id;
}



public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getCenter_id() {
	return center_id;
}
public void setCenter_id(int center_id) {
	this.center_id = center_id;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}




}
