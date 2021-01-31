package com.company.service;

public class ProjectIDGenerator {

    private static int id=1;

    public static int generateID( ){

        return id++;
    }
}
