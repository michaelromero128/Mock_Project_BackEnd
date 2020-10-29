package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;


@Component
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository empRepo;
	
	public EmployeeDTO findById(Long id) throws Exception{
		Optional<EmployeeEntity> empEntity = empRepo.findById(id);
		if(empEntity.isPresent()) {
			return empEntity.get().getEmployeeDTO();			
		}else {
			throw new Exception("Employee Not Found");
		}	
	}
	
	public EmployeeDTO addEmployee(EmployeeDTO dto)throws Exception{
		if(!validate(dto)) {
			throw new Exception( "Employee missformed");
		}
		EmployeeEntity entity = new EmployeeEntity();
		entity.setEmpAddressLine1(dto.getEmpAddressLine1());
		entity.setEmpAddressLine2(dto.getEmpAddressLine2());
		entity.setEmpCity(dto.getEmpCity());
		entity.setEmpEmail(dto.getEmpEmail());
		entity.setEmpMobile(dto.getEmpMobile());
		entity.setEmpName(dto.getEmpName());
		entity.setEmpState(dto.getEmpState());
		EmployeeDTO otherDTO = empRepo.save(entity).getEmployeeDTO();
		System.out.println("wah");
		return otherDTO;
	}
	
	private boolean validate(EmployeeDTO dto) {
		if(dto != null) {
			return true;
		}
		return false;
	}

}
