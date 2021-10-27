package com.slyworks.a11_iterator_pattern;

import java.util.Iterator;

public class DinerMenu implements Menu{
    //region Vars
    private static final int MAX_ITEMS = 6;
    private int mNumberOfItems = 0;
    private MenuItem[] mMenuItems = new MenuItem[MAX_ITEMS] ;
    //endregion

    //TODO:add constructor here

    //TODO:addItem here

    @Override
    public Iterator<MenuItem> createIterator(){
         return new DinerMenuIterator(mMenuItems);
    }

}
