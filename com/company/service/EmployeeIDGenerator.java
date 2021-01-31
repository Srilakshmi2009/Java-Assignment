package com.company.service;

public class EmployeeIDGenerator {

    private static int id=1;

    public static int generateID( ){

        return id++;
    }
}
