package com.slyworks.a12_composite_pattern;

import com.slyworks.a11_iterator_pattern.Menu;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    //region Vars
    private Stack<Iterator<MenuComponent>> mStack = new Stack<>();
    //endregion


    public CompositeIterator(Iterator<MenuComponent> iterator) {
        mStack.push(iterator);
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator<MenuComponent> iterator = mStack.peek();

            MenuComponent component = iterator.next();

            mStack.push(component.createIterator());

            //if its a menuItem(leaf) a NullIterator is returned and no further iteration occurs
            return component;
        }

        return null;
    }

    @Override
    public boolean hasNext() {
        if(mStack.empty()){
            return false;
        }else{
            Iterator<MenuComponent> iterator = mStack.peek();

            if(!iterator.hasNext()){
                mStack.pop();
                return hasNext();
            }else return true;//there is another element???
        }
    }

}
