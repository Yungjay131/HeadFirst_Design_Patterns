package com.slyworks.a12_composite_pattern;

import java.util.Iterator;

public class MenuPresenter2 {
    //region Vars
    private MenuComponent allMenus;
    //endregion


    public MenuPresenter2(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    //testing out recursion
    public void printVegetarianMenu(){
        Iterator<MenuComponent> iterator = allMenus.createIterator();

        System.out.println("\nVEGETARIAN MENU\n----");

        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();

            try{
                //menus(nodes) would throw an UnsupportedOperationException, but not the MenuItems(leaf)
                //hence the catch()
                if(menuComponent.isVegetarian()) menuComponent.print();
            } catch (UnsupportedOperationException e){ }
        }
    }
}
