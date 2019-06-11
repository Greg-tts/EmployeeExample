package com.work.employee.dao;

import java.util.List;

import com.work.employee.model.EmployeeVO;

public interface EmployeeDAO 
{
	public List<EmployeeVO> getAllEmployees();
}