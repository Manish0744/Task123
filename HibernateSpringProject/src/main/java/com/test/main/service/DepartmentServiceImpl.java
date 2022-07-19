package com.test.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.main.dao.DepartmentDAO;
import com.test.main.entity.Department;
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentDAO departmentDAO;
	 
	@Transactional
	public void save(Department department) {
		departmentDAO.save(department);
	}

	@Transactional(readOnly = true)
	public List<Department> list() {
		return departmentDAO.list();
	}

}
