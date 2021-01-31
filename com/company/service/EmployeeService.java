
package com.company.service;

import com.company.framework.MenuProvider;
import java.util.ArrayList;
import java.util.List;
import com.company.framework.*;
import com.company.model.Employee;
import com.company.repository.EmployeeRepository;
import com.company.service.MenuService;

public class EmployeeService implements MenuProvider{
    private EmployeeRepository employeeRepository=new EmployeeRepository();
    public void createEmployee(String name,int age,int salary)
    {
       Employee employee=new Employee(name,salary,EmployeeIDGenerator.generateID(),age);
       employeeRepository.save(employee);
    }
 public void  updateEmployee(int employeeId, String name,
                                 int age,int salary)
  {
     Employee employee=employeeRepository.retrieve(employeeId);
     employee.update(name,age,salary);
     employeeRepository.save(employee);
  }
 public void deleteEmployee(int employeeId)
    {
      employeeRepository.delete(employeeId);
    }
    public List<Employee> listEmployee()
    {
    return employeeRepository.listallEmployees();

    }
    @Override
    public Menu showMenu() {
           return new Menu("Employee",new MenuItem(1,"Create Employee"),
                                           new MenuItem(2,"Delete Employee"),
                                           new MenuItem(3,"Update Employee"),
                                           new MenuItem(4,"List Employee"));
    }
}
