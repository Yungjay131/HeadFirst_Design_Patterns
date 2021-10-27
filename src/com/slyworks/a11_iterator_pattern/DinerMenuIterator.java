package com.slyworks.a11_iterator_pattern;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
    //region Vars
    private MenuItem[] mItems;
    private int mPosition = 0;
    //endregion


    public DinerMenuIterator(MenuItem[] items) {
        this.mItems = items;
    }

    @Override
    public MenuItem next() {
        return mItems[mPosition++];
    }

    @Override
    public boolean hasNext() {
        return mPosition < mItems.length && mItems[mPosition] != null;
    }

    @Override
    public void remove() {
        if(mPosition <= 0)
            throw new IllegalStateException("You can't remove an item until you've called next() at least once");

        if(mItems[mPosition-1] != null){
            int startPosition = mPosition-1;
            int endPosition = mItems.length-1;

            //old way
            /*for( int index = startPosition ; index < endPosition; index++ ){
                mItems[index] = mItems[index+1];
            }*/

            //improved way, shifting the elements by one
            if (endPosition - startPosition >= 0)
                System.arraycopy(mItems, startPosition + 1, mItems, startPosition, endPosition - startPosition);

            mItems[mItems.length-1] = null;
        }
    }
}
