package com.test.main.dao;

import java.util.List;

import com.test.main.entity.Department;

public interface DepartmentDAO {
	void save(Department department); 
	List<Department> list();
}
