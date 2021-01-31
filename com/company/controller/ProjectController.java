package com.company.controller;
import com.company.framework.*;
import com.company.service.projectService;

public class ProjectController {
    projectService projectService=new projectService();
    public void createProject()
    {
          projectService.createProject();
    }
    public void  updateProject(String employeeId)
    {
       projectService.updateProject(employeeId);
    }
    public void deleteProject(String employeeId)
    {
        projectService.deleteProject(employeeId);
    }
    public void listProject()
    {
         projectService.listProject();
    }
    public Menu showProjectMenu() {
         return projectService.showMenu();
    }
}
