package com.company.controller;
import com.company.framework.Menu;
import com.company.model.Employee;
import com.company.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    private EmployeeService employeeService=new EmployeeService();

    public int createEmployee(final String name,final int age,final int salary)
    {
        if(isdatavalid(name,age,salary))
            employeeService.createEmployee(name,age,salary);
            return -1;
    }
  public void  updateEmployee(int employeeId,
                              final String name,final int age,
                              final int salary)
    {
        if(employeeId<0)
            throw new RuntimeException("Invalid employeeId");
         employeeService.updateEmployee(employeeId,name,age,salary);
    }
    public void deleteEmployee(int employeeId)
    {
        employeeService.deleteEmployee(employeeId);
    }
    public List<Employee> listEmployee()
    {
      return employeeService.listEmployee();
    }
    public static boolean isdatavalid(String name,int age,int salary)
    {  boolean isValid=true;
        if(age<0) {
            System.out.println("Age is not valid");
             isValid=false;
        }
        if(name==null||name.equals(""))
        {
            System.out.println("name is not valid");
             isValid=false;
        }
        if(salary<0) {
            System.out.println("salary is not valid");
            isValid = false;
        }
        return isValid;
     }

    public Menu showEmployeeMenu() {
      return employeeService.showMenu();
    }
}
