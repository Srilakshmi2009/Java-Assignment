package com.company.framework;

public class MenuItem {
    private String name;
    private int id;

    public MenuItem(int id,String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
