package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.observer.StockBroadcast;
import com.cangjie.designpatternexercise.observer.StockPerson;

public class ObserverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
        StockBroadcast sb = new StockBroadcast("spaceflight");
        StockPerson sp1 = new StockPerson(100,"Tony");
        StockPerson sp2 = new StockPerson(120,"Jennifer");
        StockPerson sp3 = new StockPerson(102,"Bonnie");

        sb.boughtStock(sp1);
        sb.boughtStock(sp2);
        sb.boughtStock(sp3);

        sb.sendBroadcast(110);
    }
}
