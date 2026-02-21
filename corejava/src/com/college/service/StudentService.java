package com.college.service;
//import com.college.model.Person;

public class StudentService {
	public double calculateDiscountedFee(double fee, double discountPercent) {
		return fee-(fee*discountPercent/100);
	}

}
