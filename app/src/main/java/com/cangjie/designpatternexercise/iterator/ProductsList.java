package com.cangjie.designpatternexercise.iterator;

import java.util.List;

/**
 * author：CangJie on 2016/8/1 14:48
 * email：cangjie2016@gmail.com
 */
public class ProductsList extends AbstractList {
    public ProductsList(List<Object> lists) {
        super(lists);
    }

    @Override
    public AbstractIterator iterator() {
        return new ProductIterator(this);
    }
    public class ProductIterator extends AbstractIterator{

        public ProductIterator(ProductsList list) {
            super(list);
        }

        @Override
        public void next() {
            if(cursor1 < this.objs.size())
                cursor1++;
        }

        @Override
        public void previous() {
            if(cursor2 > -1)
                cursor2--;
        }

        @Override
        public boolean isLast() {
            return cursor1 == this.objs.size();
        }

        @Override
        public boolean isFirst() {
            return cursor2 == -1;
        }

        @Override
        public Object getNextItem() {
            return this.objs.get(cursor1);
        }

        @Override
        public Object getPreviousItem() {
            return this.objs.get(cursor2);
        }

        @Override
        public void print() {

        }
    }
}
