package com.behiye.service;

import java.util.List;

import com.behiye.domain.Department;
import com.behiye.domain.Employee;
import com.behiye.domain.Job;

public interface EmployeeService {

	public List<Employee> getEmployee();

	public List<Job> getJobList();

	public void saveEmployee(Employee emp);

	public List<Department> getDepartmentList();

	public List<Employee> getManagerList();

	public Employee getEmployee(int empId);

	public void deleteEmployee(int empId);

	public Object findUserContact(Integer employeeId, String freeText);

}
