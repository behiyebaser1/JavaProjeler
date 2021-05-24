package com.behiye.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.behiye.domain.Department;
import com.behiye.domain.Employee;
import com.behiye.domain.Job;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public List<Employee> getOgrenciler() {

		Session session = sessionFactory.getCurrentSession();

		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		List<Employee> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public List<Job> getJobList() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();

		Query<Job> query = session.createQuery("from Job", Job.class);
		List<Job> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public void saveEmployee(Employee emp) {

		Session session = sessionFactory.getCurrentSession();

		session.saveOrUpdate(emp);

	}

	@Override
	public List<Department> getDepartmentList() {

		Session session = sessionFactory.getCurrentSession();

		Query<Department> query = session.createQuery("from Department", Department.class);
		List<Department> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public List<Employee> getManagerList() {

		Session session = sessionFactory.getCurrentSession();

		Query<Employee> query = session.createQuery("from Employee", Employee.class);
		List<Employee> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public Employee getEmployee(int empId) {

		Session session = sessionFactory.getCurrentSession();

		Employee emp = session.get(Employee.class, empId);

		return emp;
	}

	@Override
	public void deleteEmployee(int empId) {

		Session session = sessionFactory.getCurrentSession();
		Employee emp = session.get(Employee.class, empId);
		session.delete(emp);
	}

	@Override
	public Object findUserContact(Integer employeeId, String freeText) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "Select employeeId, firstName, lastName, email, salary, manager.fistName, department.departmentName FROM "
				+ "employees where employeeId=? AND "
				+ " (fistName LIKE '%\"+txt+\"%' OR lastName LIKE '%\"+txt+\"%' OR email LIKE '%\"+txt+\"%'"
				+ " OR salary LIKE '%\"+txt+\"%' " + "OR  manager.fistName LIKE '%\"+txt+\"%' "
				+ "OR department.departmentName LIKE '%\"+txt+\"%')";
		return sql;

	}

}
