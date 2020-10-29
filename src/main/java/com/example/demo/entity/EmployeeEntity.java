package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.dto.EmployeeDTO;


@Entity
@Table(name ="employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name ="empName")
	private String empName;
	
	@Column(name = "empMobile")
	private String empMobile;
	
	@Column(name = "empEmail")
	private String empEmail;
	
	@Column( name = "empAddressLine1")
	private String empAddressLine1;
	
	@Column(name = "empAddressLine2")
	private String empAddressLine2;
	
	@Column(name = "empCity")
	private String empCity;
	
	@Column( name = "empState")
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
	
	
	public EmployeeDTO getEmployeeDTO() {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setId(id);
		dto.setEmpName(empName);
		dto.setEmpMobile(empMobile);
		dto.setEmpEmail(empEmail);
		dto.setEmpAddressLine1(empAddressLine1);
		dto.setEmpAddressLine2(empAddressLine2);
		dto.setEmpCity(empCity);
		dto.setEmpState(empState);
		return dto;
	}
}
