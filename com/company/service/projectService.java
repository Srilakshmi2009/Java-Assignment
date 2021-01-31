package com.company.service;

import com.company.framework.Menu;
import com.company.framework.MenuItem;
import com.company.framework.MenuProvider;

public class projectService implements MenuProvider {
    public void createProject()
    {

    }
    public void  updateProject(String employeeId)
    {

    }
    public void deleteProject(String employeeId)
    {

    }
    public void listProject()
    {

    }

    public  Menu showMenu()
    {
        return new Menu("Project",new MenuItem(4,"Create Project"),
                new MenuItem(5,"Delete Project"),
                new MenuItem(6,"Update Project"),
                new MenuItem(7,"List of Projects"),
                new MenuItem(8,"Add Employees to Projects"),
                new MenuItem(9,"List of Employees for the Project"));

    }
}
