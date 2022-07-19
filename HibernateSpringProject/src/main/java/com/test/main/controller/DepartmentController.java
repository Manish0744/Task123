package com.test.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.main.entity.Department;
import com.test.main.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/department")
	public String createDepartment(@RequestBody Department department)
	{	
		departmentService.save(department);
		return "Department has been successfully added.";
	}
	
	@GetMapping("/allDepartment")
	public List<Department> findAllDepartment()
	{
		return departmentService.list();
	}

}
