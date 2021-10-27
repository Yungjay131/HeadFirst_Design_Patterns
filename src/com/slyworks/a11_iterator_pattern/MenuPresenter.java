package com.slyworks.a11_iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class MenuPresenter {
    //region Vars
    private Menu mBreakFastMenu;
    private Menu mDinerMenu;
    private Menu mCafeMenu;

    private ArrayList<Menu> mMenus;
    //endregion


    public MenuPresenter(Menu mBreakFastMenu, Menu mDinerMenu, Menu cafeMenu) {
        this.mBreakFastMenu = mBreakFastMenu;
        this.mDinerMenu = mDinerMenu;
        this.mCafeMenu = cafeMenu;
    }

    public MenuPresenter(ArrayList<Menu> menus){
        this.mMenus = menus;
    }

    public void printMenu(){
        Iterator<Menu> menuIterator = mMenus.iterator();

        while(menuIterator.hasNext()){
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }

    }

    private void printMenu(Iterator<MenuItem> iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = iterator.next();

            System.out.println(menuItem.getName().concat(", "));
            System.out.println(menuItem.getPrice()+" -- ");
            System.out.println(menuItem.getDescription());
        }

    }
}
