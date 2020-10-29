package com.example.demo.dto;

import com.example.demo.entity.EmployeeEntity;

public class EmployeeDTO {
	
	private Long id;
	private String empName;
	private String empMobile;
	private String empEmail;
	private String empAddressLine1;
	private String empAddressLine2;
	private String empCity;
	private String empState;
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getEmpMobile() {
		return empMobile;
	}



	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}



	public String getEmpEmail() {
		return empEmail;
	}



	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}



	public String getEmpAddressLine1() {
		return empAddressLine1;
	}



	public void setEmpAddressLine1(String empAddressLine1) {
		this.empAddressLine1 = empAddressLine1;
	}



	public String getEmpAddressLine2() {
		return empAddressLine2;
	}



	public void setEmpAddressLine2(String empAddressLine2) {
		this.empAddressLine2 = empAddressLine2;
	}



	public String getEmpCity() {
		return empCity;
	}



	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}



	public String getEmpState() {
		return empState;
	}



	public void setEmpState(String empState) {
		this.empState = empState;
	}



	
	
	public String toString() {
		return String.format("%s \n %s \n %s \n %s \n %s \n %s \n %s \n %s \n" , this.empName, this.id, this.empEmail, this.empMobile, this.empAddressLine1, this.empAddressLine2, this.empCity, this.empState);
	}

}
