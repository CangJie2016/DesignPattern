package com.cangjie.designpatternexercise.observer;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/8/3 14:58
 * email：cangjie2016@gmail.com
 */
public class StockBroadcast extends Broadcast{

    private String stockName;

    public StockBroadcast(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public void sendBroadcast(int newPrice) {
        DebugLog.w("stock :"+ stockName +",current price is "+newPrice);
        for(Person person : persons)
            person.broadcast(newPrice);
    }

}
