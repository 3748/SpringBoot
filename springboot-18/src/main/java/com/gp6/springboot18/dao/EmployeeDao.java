package com.gp6.springboot18.dao;


import com.gp6.springboot18.entities.Department;
import com.gp6.springboot18.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

	private static Map<Integer, Employee> employees = null;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	static{
		employees = new HashMap<>();

		employees.put(1001, new Employee(1001, "赵1", "zhao@163.com", 1, new Department(101, "研发")));
		employees.put(1002, new Employee(1002, "钱2", "qian@163.com", 1, new Department(102, "设计")));
		employees.put(1003, new Employee(1003, "孙3", "sun@163.com", 0, new Department(103, "产品")));
		employees.put(1004, new Employee(1004, "李四", "li@163.com", 0, new Department(104, "测试")));
	}
	
	private static Integer initId = 1006;
	
	public void save(Employee employee){
		if(employee.getId() == null){
			employee.setId(initId++);
		}
		
		employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));
		employees.put(employee.getId(), employee);
	}

	//查询所有员工
	public Collection<Employee> getAll(){
		return employees.values();
	}
	
	public Employee get(Integer id){
		return employees.get(id);
	}
	
	public void delete(Integer id){
		employees.remove(id);
	}
}
