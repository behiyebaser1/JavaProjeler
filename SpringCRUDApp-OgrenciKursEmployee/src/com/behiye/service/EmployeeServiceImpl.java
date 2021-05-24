package com.behiye.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.behiye.dao.EmployeeDAO;
import com.behiye.domain.Department;
import com.behiye.domain.Employee;
import com.behiye.domain.Job;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	@Override
	public List<Employee> getEmployee() {

		return employeeDAO.getOgrenciler();
	}

	@Transactional
	@Override
	public List<Job> getJobList() {
		// TODO Auto-generated method stub
		return employeeDAO.getJobList();
	}

	@Transactional
	@Override
	public void saveEmployee(Employee emp) {
		employeeDAO.saveEmployee(emp);

	}

	@Transactional
	@Override
	public List<Department> getDepartmentList() {

		return employeeDAO.getDepartmentList();
	}

	@Transactional
	@Override
	public List<Employee> getManagerList() {

		return employeeDAO.getManagerList();
	}

	@Transactional
	@Override
	public Employee getEmployee(int empId) {

		return employeeDAO.getEmployee(empId);
	}

	@Transactional
	@Override
	public void deleteEmployee(int empId) {

		employeeDAO.deleteEmployee(empId);

	}

	@Transactional
	@Override
	public Object findUserContact(Integer userId, String freeText) {
		// TODO Auto-generated method stub
		return employeeDAO.findUserContact(userId, freeText);
	}

}
