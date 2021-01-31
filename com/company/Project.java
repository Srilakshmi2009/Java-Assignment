package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {

   private String projectName;
   private int projectId;
   private int noOfModules;
   //private Date startDate;
   //private Date endDate;


    public Project() {
    }

    public Project(String projectName, int projectId, int noOfModules, Date startDate, Date endDate) {
        this.projectName = projectName;
        this.projectId = projectId;
        this.noOfModules = noOfModules;
       // this.startDate = startDate;
       // this.endDate = endDate;

    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getNoOfModules() {
        return noOfModules;
    }

    public void setNoOfModules(int noOfModules) {
        this.noOfModules = noOfModules;
    }

    public void addPro(String name,int id,int modules) {
        if (name != null) {
            this.projectName = name;
            this.projectId = id;
            this.noOfModules = modules;
        }
    }
    }

