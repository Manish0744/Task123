package com.test.main.service;

import java.util.List;

import com.test.main.entity.Department;

public interface DepartmentService {
	 void save(Department department);
	 List<Department> list();
}
