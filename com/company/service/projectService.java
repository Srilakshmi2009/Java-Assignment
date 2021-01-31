package com.company.service;

import com.company.framework.Menu;
import com.company.framework.MenuItem;
import com.company.framework.MenuProvider;
import com.company.model.Project;
import com.company.repository.ProjectRepository;

public class projectService implements MenuProvider {
    ProjectRepository projectRepository=new ProjectRepository();
    public void createProject(String name,int modules)
    {
        Project project=new Project(ProjectIDGenerator.generateID(),name,modules);
        projectRepository.save(project);
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
