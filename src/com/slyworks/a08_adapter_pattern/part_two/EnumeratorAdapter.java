package com.slyworks.a08_adapter_pattern.part_two;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumeratorAdapter implements Iterator<Object> {
    //region Vars
    private Enumeration<?> enumeration;
    //endregion

    public EnumeratorAdapter(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        /*
        the addition  of default interface methods makes it possible
        that this method has a default implementation defined in the interface itself
         */
        throw new UnsupportedOperationException();
    }
}
