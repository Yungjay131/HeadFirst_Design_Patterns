package com.slyworks.a12_composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu2 extends MenuComponent {
  /*this serves as COMPOSITE class, can hold MenuItems(leaves) or other Menus(nodes)*/
   //region Vars
    private ArrayList<MenuComponent> mMenuComponents = new ArrayList<>();
    private String mName;
    private String mDescription;

    private Iterator<MenuComponent> mIterator = null;
   //endregion


    public Menu2(String mName, String mDescription) {
        this.mName = mName;
        this.mDescription = mDescription;
    }

    @Override
    public void add(MenuComponent component) {
        mMenuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        mMenuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return mMenuComponents.get(index);
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getDescription() {
        return mDescription;
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if(mIterator == null){
            mIterator = new CompositeIterator(mMenuComponents.iterator());
        }

        return mIterator;
    }

    @Override
    public void print() {
        System.out.println("\n" + getName());
        System.out.println(", "+getDescription());
        System.out.println("-------------------");

        //since this class is a COMPOSITE,printing for the nodes and leaves it may contain
        Iterator<MenuComponent> iterator = mMenuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}
