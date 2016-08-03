package com.cangjie.designpatternexercise.observer;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/8/3 14:53
 * email：cangjie2016@gmail.com
 */
public class StockPerson extends Person{
    private int stockPrice;
    private String name;

    public StockPerson(int stockPrice, String name) {
        this.stockPrice = stockPrice;
        this.name = name;
    }
    @Override
    public void broadcast(int newPrice){
        if(newPrice >= stockPrice * 1.05 || newPrice <= stockPrice * 0.95){
            notify(newPrice);
        }
    }
    private void notify(int newPrice){
        DebugLog.w("name:"+name+",your bought stock now price is +"+newPrice+" dollar!");
    }

}
