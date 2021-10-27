package com.slyworks.a11_iterator_pattern;

import java.util.ArrayList;

public class BreakfastMenuIterator implements Iterator<MenuItem>{
    //region Vars
    private ArrayList<MenuItem> mItems;
    private int mPosition = 0;
    //endregion


    public BreakfastMenuIterator(ArrayList<MenuItem> items) {
        this.mItems = items;
    }

    @Override
    public MenuItem next() {
        return mItems.get(mPosition++);
    }

    @Override
    public boolean hasNext() {
        return ( mPosition == mItems.size()-1 );
    }

}
