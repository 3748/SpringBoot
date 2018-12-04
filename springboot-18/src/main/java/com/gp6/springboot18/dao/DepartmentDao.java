package com.gp6.springboot18.dao;


import com.gp6.springboot18.entities.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {

    private static Map<Integer, Department> departments;

    static {
        departments = new HashMap<>();
        departments.put(101, new Department(101, "研发"));
        departments.put(102, new Department(102, "测试"));
        departments.put(103, new Department(103, "产品"));
        departments.put(104, new Department(104, "设计"));
    }

    public Collection<Department> getDepartments() {
        return departments.values();
    }

    public Department getDepartment(Integer id) {
        return departments.get(id);
    }

}
