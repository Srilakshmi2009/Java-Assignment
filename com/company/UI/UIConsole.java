package com.company.UI;

import com.company.controller.EmployeeController;
import com.company.controller.ProjectController;
import com.company.framework.Menu;
import com.company.controller.MenuController;
import com.company.framework.MenuItem;
import java.util.List;
import java.util.Scanner;
import com.company.framework.MenuProvider;
import static java.awt.SystemColor.menu;

public class UIConsole {
    private static Scanner scanner=new Scanner(System.in);
    private static EmployeeController employeeController=new EmployeeController();
    private static ProjectController projectController=new ProjectController();
    private static MenuController menuController=new MenuController();
    public static void main(String[] args) {
        while (true) {
            System.out.println("what can I do for u");
            System.out.println("I have below options available");
            printMenu(menuController.menus());
            final int userschoice = askUserChoice();
            System.out.println("U hav chosen " + userschoice);
        }
    }
    public static int askUserChoice() {
        System.out.println("Choose ur choice");
        return scanner.nextInt();
    }


    public static void printMenu(List<Menu> menus) {
        for (Menu menu : menus) {
            System.out.println(menu.getLabel() + ".");
            for (MenuItem menuItem : menu.getMenuItems())
                System.out.println(menuItem.getId() + "   " + menuItem.getName());
        }
    }
}

