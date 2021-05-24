package com.behiye.dao;

import java.util.List;

import com.behiye.domain.Department;
import com.behiye.domain.Employee;
import com.behiye.domain.Job;

public interface EmployeeDAO {

	public List<Employee> getOgrenciler();

	public List<Job> getJobList();

	public void saveEmployee(Employee emp);

	public List<Department> getDepartmentList();

	public List<Employee> getManagerList();

	public Employee getEmployee(int empId);

	public void deleteEmployee(int empId);

	public Object findUserContact(Integer employeeId, String freeText);

}
