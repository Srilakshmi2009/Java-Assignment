package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Project[] project=new Project[10];
        boolean quit = true;
        int i=0;
        while (quit==true)
        {
        printList();
        System.out.println("Enter ur choice");
        int Option = sc.nextInt();

        switch (Option) {
            case 1:
                System.out.println("Enter name" );
                String name=sc.next();
                System.out.println("ID:");
                int id=sc.nextInt();
                System.out.println("Modules ");
                int modules=sc.nextInt();
                project[i].addPro(name,id,modules);
                i++;
                break;

            case 2:
                System.out.println("List of Projects");
               // public void listOfProjects(Project p) {
                    for(Project p:project)
                    System.out.println(p);
                break;
            case 0:
                quit = false;
                break;
        }
    }
}

	public static void printList()
    {
        System.out.println("List of operations");
        System.out.println("1.To add Projects");
        System.out.println("2.To List Projects");
        System.out.println("3.To add employees to Projects");
        System.out.println("4.To remove employees from Projects");
        System.out.println("5.To delete Project");
        System.out.println("6.To list Employees for given Project");

    }
   /* public static void addProject()
    {
        ArrayList<String> values=new ArrayList<String>();
        System.out.println("Enter name" );
        values.add(sc.next());
        System.out.println("ID:");
        values.add(sc.next());
        System.out.println("Modules ");
        values.add( sc.next());
        System.out.println(values);
        return values;

 }*/
    /*  public  static void listProjects(ArrayList p)
    {
        for(int i=0;i<p.size();i++)
        {
            System.out.println(p.get(i));
        }

    }*/




}
