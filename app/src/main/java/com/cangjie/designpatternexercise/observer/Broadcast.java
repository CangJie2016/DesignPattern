package com.cangjie.designpatternexercise.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author：CangJie on 2016/8/3 14:58
 * email：cangjie2016@gmail.com
 */
public abstract class Broadcast {
    protected List<Person> persons = new ArrayList<>();

    public void boughtStock(Person per){
        persons.add(per);
    }
    public void sell(Person per){
        persons.remove(per);
    }
    public abstract void sendBroadcast(int newPrice);
}
