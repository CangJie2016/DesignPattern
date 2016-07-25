package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.bridge.DataChange;
import com.cangjie.designpatternexercise.bridge.DataChangeWps;
import com.cangjie.designpatternexercise.bridge.DataFrom;
import com.cangjie.designpatternexercise.bridge.DataFromExcel;

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
        DataChange changer = new DataChangeWps();
        DataFrom dataFrom = new DataFromExcel();
        changer.setData(dataFrom);
        changer.change();
    }
}
