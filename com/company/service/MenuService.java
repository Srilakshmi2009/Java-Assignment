package com.company.service;

import com.company.framework.Menu;
import com.company.framework.MenuProvider;

import java.util.ArrayList;
import java.util.List;

public class MenuService{

    public List<Menu> menus() {
      List<Menu> allMenus=new ArrayList<>();

      MenuProvider employeeMenuProvider=new EmployeeService();
      allMenus.add(employeeMenuProvider.showMenu());

      MenuProvider projectMenuProvider=new projectService();
      allMenus.add(projectMenuProvider.showMenu());

      return allMenus;
    }
}
