package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.service.EmployeeService;

@RestController
public class Controller {
	@Autowired
	private EmployeeService empService;
	
	@CrossOrigin
	@GetMapping("/id/{empId}")
	public ResponseEntity<EmployeeDTO>  getEmployee(@PathVariable("empId") Long empId) throws Exception{
		
		try{
			EmployeeDTO dto = empService.findById(empId);
		
			ResponseEntity<EmployeeDTO> response = new ResponseEntity<EmployeeDTO>(dto, HttpStatus.OK);
			return response;
		}catch(Exception ex){
			throw ex;
		}
	}
	@CrossOrigin
	@PostMapping("/add")
		public ResponseEntity<EmployeeDTO> addEmployee(RequestEntity<EmployeeDTO> request) throws Exception{
		try{
			System.out.println("buh");
			EmployeeDTO employee = request.getBody();
			
			EmployeeDTO newEmployee= empService.addEmployee(employee);
			ResponseEntity<EmployeeDTO> response = new ResponseEntity<EmployeeDTO>(newEmployee, HttpStatus.OK);
			
			return response;
		}catch(Exception ex) {
			System.out.println("zoltan");
			System.out.println(ex.getMessage());
			throw ex;
		}
	}

}
