package com.company.model;

public class Project {

    private int uId;
    private String name;
    private int noOfModules;

    public Project(String name, int noOfModules) {
        this.name = name;
        this.noOfModules = noOfModules;
    }

    public int getuId() {
        return uId;
    }

    public String getName() {
        return name;
    }

    public int getNoOfModules() {
        return noOfModules;
    }

    public void displayInformation(){
        System.out.println(this.name+"  "+this.uId+"  "+this.noOfModules);
    }

    public void update(String name,int noOfModules)
    {
        this.name=name;
        this.noOfModules=noOfModules;
    }
}

