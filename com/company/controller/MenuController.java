package com.company.controller;

import com.company.service.MenuService;
import com.company.framework.Menu;

import java.util.List;

public class MenuController {
    private MenuService menuservice=new MenuService();

    public List<Menu> menus()
    {
        return menuservice.menus();
    }
}
