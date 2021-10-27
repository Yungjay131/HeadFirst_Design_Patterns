package com.slyworks.a11_iterator_pattern;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu {
    //region Vars
    private HashMap<String, MenuItem> mItems = new HashMap<>();
    //endregion


    public CafeMenu() {

    }

    public void addItem(MenuItem menuItem){
        mItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return mItems.values().iterator();
    }


}
