package com.behiye.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.behiye.domain.Department;
import com.behiye.domain.Employee;
import com.behiye.domain.Job;
import com.behiye.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/list")
	public String employeeList(Model model, HttpSession oturum) {

		String isimKontrol = (String) oturum.getAttribute("oturum");
		if (isimKontrol == null) {
			return "redirect:/user/login";
		} else {

			List<Employee> empList = employeeService.getEmployee();

			model.addAttribute("employee", empList);

			return "employee-list";
		}
	}

	@GetMapping("/calýsan-ekle")
	public String ogrenciEkle(Model model, HttpSession oturum) {

		String logincontrol = (String) oturum.getAttribute("oturum");
		if (logincontrol == null) {
			return "redirect:/user/login";
		}

		Employee emp = new Employee();
		model.addAttribute("employee", emp);

		return "employee-form";

	}

	@GetMapping("/anasayfa")
	public String anasayfa(Model model, HttpSession oturum) {

		return "welcome";

	}

	@PostMapping("/calýsan-kaydet")
	public String calýsanKaydet(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			return "employee-form";
		}

		employeeService.saveEmployee(emp);

		return "redirect:/employee/list";
	}

	@GetMapping("/calýsan-guncelle")
	public String calýsanGuncelle(@RequestParam("employeeId") int empId, Model model) {

		Employee emp = employeeService.getEmployee(empId);
		model.addAttribute("employee", emp);

		return "employee-form";

	}

	@GetMapping("/calýsan-sil")
	public String calýsanSil(@RequestParam("employeeId") int empId) {// geçiþ söz konusu deðil
																		// modeli sildik

		employeeService.deleteEmployee(empId);

		return "redirect:/employee/list";

	}

	@RequestMapping(value = "/search")
	public String employeeSearch(Model model, HttpSession session, @RequestParam("freeText") String freeText) {

		Integer employeeId = (Integer) session.getAttribute("employeeId");
		model.addAttribute("employee", employeeService.findUserContact(employeeId, freeText));
		return "employee-list";

	}

	@ModelAttribute("jobs")
	public Map<String, String> getJobs() {
		Map<String, String> jobs = new HashMap<String, String>();

		List<Job> jobsList = employeeService.getJobList();
		for (Job job : jobsList) {

			jobs.put(job.getJobId(), job.getJobTitle());

		}
		return jobs;

	}

	@ModelAttribute("managers")
	public Map<Integer, String> getManagers() {
		Map<Integer, String> managers = new HashMap<Integer, String>();

		List<Employee> employeeList = employeeService.getManagerList();
		for (Employee emp : employeeList) {

			managers.put(emp.getEmployeeId(), emp.getFirstName());

		}
		return managers;

	}

	@ModelAttribute("departments")
	public Map<Integer, String> getDepartments() {
		Map<Integer, String> departments = new HashMap<Integer, String>();

		List<Department> deptsList = employeeService.getDepartmentList();
		for (Department dep : deptsList) {

			departments.put(dep.getDepartmentId(), dep.getDepartmentName());

		}
		return departments;

	}
}
