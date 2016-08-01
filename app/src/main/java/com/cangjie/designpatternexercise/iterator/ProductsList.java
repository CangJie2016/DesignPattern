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
}
