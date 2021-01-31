package com.company.framework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.*;

public class Menu {
  private String label;
  private List<MenuItem> menuItems;

    public Menu(String label, List<MenuItem> menuitems) {
        this.label = label;
        this.menuItems = menuitems;
    }

    public String getLabel() {
        return label;
    }
    public Menu(String label, MenuItem... menuItems)
    {
        this.label=label;
        this.menuItems= Arrays.asList(menuItems);
    }
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "label='" + label + '\'' +
                ", menuitems=" + menuItems +
                '}';
    }
}
