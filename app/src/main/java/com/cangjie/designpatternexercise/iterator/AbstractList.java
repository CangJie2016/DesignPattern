package com.cangjie.designpatternexercise.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * author：CangJie on 2016/8/1 14:45
 * email：cangjie2016@gmail.com
 */
public abstract class AbstractList {
    private List<Object> lists = new ArrayList<>();

    public AbstractList(List<Object> lists) {
        this.lists = lists;
    }
    public void addObject(Object obj){
        lists.add(obj);
    }
    public void removeObject(Object obj){
        lists.remove(obj);
    }
    public void removeObject(int position){
        lists.remove(position);
    }
    public List<Object> getObjects(){
        return lists;
    }
    public abstract AbstractIterator iterator();
}
