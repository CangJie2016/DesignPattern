package com.cangjie.designpatternexercise.iterator;

import java.util.List;

/**
 * author：CangJie on 2016/8/1 14:48
 * email：cangjie2016@gmail.com
 */
public abstract class AbstractIterator {
    protected int cursor1,cursor2;
    private AbstractList list;
    protected List<Object> objs;

    public AbstractIterator(AbstractList list) {
        this.list = list;
        this.objs = list.getObjects();
        cursor1 = 0;
        cursor2 = this.objs.size() - 1;
    }
    public abstract void next();
    public abstract void previous();
    public abstract boolean isLast();
    public abstract boolean isFirst();
    public abstract Object getNextItem();
    public abstract Object getPreviousItem();
    public abstract void print();

}
