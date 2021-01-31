package com.company.repository;

import com.company.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
    private static Map<Integer,Employee> employeeData=new HashMap<>();
    public void save(Employee employee)
    {
        employeeData.put(employee.getUniqueIdentifier(),employee);
    }
    public Employee retrieve(final int key)
    {
        return employeeData.get(key);
    }
    public boolean delete(int employeeId) {
        if (employeeData.containsKey(employeeId)) {
            employeeData.remove(employeeId);
            return true;
        }
       // throw new RuntimeException("Employee is not found");
        return false;
    }
    public List<Employee> listallEmployees()
    {
        return new ArrayList<>(employeeData.values());
    }
}
