package com.company.repository;

import com.company.model.Employee;
import com.company.model.Project;

import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

public class ProjectRepository {
    private static Map<Integer, Project> projectData=new HashMap<>();
    public void save(Project project)
    {
        projectData.put(project.getuId(),project);
    }

}
