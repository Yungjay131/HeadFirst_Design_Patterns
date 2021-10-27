package com.slyworks.a11_iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakfastMenu implements Menu {
    //region Vars
    private int mNumberOfItems = 0;
    private ArrayList<MenuItem> mMenuItems = new ArrayList<>();
    //endregion

    //TODO:add constructor here

    //TODO:addItem here

    @Override
    public Iterator<MenuItem> createIterator(){
        //return new BreakfastMenuIterator(mMenuItems);
        return mMenuItems.iterator();
    }
}
