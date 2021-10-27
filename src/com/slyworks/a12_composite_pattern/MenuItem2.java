package com.slyworks.a12_composite_pattern;

public class MenuItem2 extends MenuComponent{
    //region Vars
    private String name;
    private String description;
    private boolean isVegetarian;
    private double price;
    //endregion


    public MenuItem2(String name, String description, boolean isVegetarian, double price) {
        this.name = name;
        this.description = description;
        this.isVegetarian = isVegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(" "+getName());

        if( isVegetarian() ){
            System.out.println("(v)");
        }

        System.out.println(", "+getPrice());
        System.out.println("    -- "+getDescription());
    }

}

