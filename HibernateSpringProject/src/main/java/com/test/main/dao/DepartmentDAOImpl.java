package com.test.main.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.main.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public void save(Department department) {
		sessionFactory.getCurrentSession().save(department);
		
	}

	@Override
	public List<Department> list() {
		@SuppressWarnings("unchecked")
	    TypedQuery<Department> query = sessionFactory.getCurrentSession().createQuery("from Department");
	    return query.getResultList();
	}

}
