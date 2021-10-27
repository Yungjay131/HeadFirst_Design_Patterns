package com.slyworks.a11_iterator_pattern;

public class MenuItem {
    //region Vars
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;
    //endregion


    public MenuItem(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
