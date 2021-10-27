package com.slyworks.a12_composite_pattern;

import java.util.Iterator;

;

public class NullIterator implements Iterator<MenuComponent> {

    @Override
    public MenuComponent next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    public void remove(){
        throw new UnsupportedOperationException();
    }

}
