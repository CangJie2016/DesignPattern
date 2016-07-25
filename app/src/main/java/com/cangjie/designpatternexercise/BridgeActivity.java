package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.bridge.DataChange;
import com.cangjie.designpatternexercise.bridge.DataChangePdf;
import com.cangjie.designpatternexercise.bridge.DataFrom;
import com.cangjie.designpatternexercise.bridge.DataFromOrcal;

public class BridgeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);
        DataChange changer = new DataChangePdf();
        DataFrom dataFrom = new DataFromOrcal();
        changer.setData(dataFrom);
        changer.change();
    }
}
