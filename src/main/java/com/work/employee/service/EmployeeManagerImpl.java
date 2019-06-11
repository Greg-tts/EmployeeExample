package com.work.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.work.employee.dao.EmployeeDAO;
import com.work.employee.model.EmployeeVO;

@Service
public class EmployeeManagerImpl implements EmployeeManager {

	@Autowired
	EmployeeDAO dao;
	
	public List<EmployeeVO> getAllEmployees() 
	{
		return dao.getAllEmployees();
	}
}
