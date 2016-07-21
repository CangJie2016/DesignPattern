package com.cangjie.designpatternexercise.create;

import android.app.Activity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.utils.XMLUtil;

public class SimpleFactoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Factory chartFactory = (Factory) XMLUtil.obtainFactory(this);
        if(chartFactory == null)
            return;
        Chart chart = chartFactory.buildChart();
        chart.construct();
        chart.display();
    }

}
