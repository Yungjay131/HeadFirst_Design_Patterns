package com.slyworks.a08_adapter_pattern.part_two;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Enumeration<Object> {
    //region Vars
    private Iterator<?> iterator;
    //endregion


    public IteratorAdapter(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }


}
