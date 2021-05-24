package com.behiye.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	@Id
	@Column(name = "employee_id")
	@SequenceGenerator(name = "emp_seq", sequenceName = "employees_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	private Integer employeeId;

	@NotEmpty(message = "This field cannot be empty.")
	@Column(name = "first_name")
	private String firstName;

	@NotEmpty(message = "This field cannot be empty.")
	@Column(name = "last_name")
	private String lastName;

	@Email(message = "Invalid email.")
	@Column(name = "email")
	private String email;

	@Pattern(regexp = "(\\d){3,3}.\\d{3,3}.\\d{4,4}", message = "The phone number must match 111.111.1111 format.")
	@Column(name = "phone_number")
	private String phoneNumber;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "hire_date")
	private Date hireDate;

	@Positive(message = "Negative value cannot be entered.")
	@Column(name = "salary")
	private Integer salary;

	@PositiveOrZero(message = "Negative value cannot be entered.")
	@DecimalMin(value = "0.0", inclusive = false, message = "Must be greater than or equal to '0.0'")
	@Column(name = "commission_pct")
	private Double commissionPercent;

	@ManyToOne
	@JoinColumn(name = "manager_id")
	private Employee manager;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job job;

	public Double getCommissionPercent() {
		return commissionPercent;
	}

	public void setCommissionPercent(Double commissionPercent) {
		this.commissionPercent = commissionPercent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	public Employee(String firstName, String lastName, String email, String phoneNumber, Date hireDate, Job job,
			Integer salary, Double commissionPercent, Employee manager, Department department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.salary = salary;
		this.commissionPercent = commissionPercent;
		this.manager = manager;
		this.department = department;
		this.job = job;
	}

	public Employee() {
		super();
	}

}
