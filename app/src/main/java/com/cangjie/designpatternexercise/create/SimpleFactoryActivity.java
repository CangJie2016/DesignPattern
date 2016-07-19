package com.cangjie.designpatternexercise.create;

import android.app.Activity;
import android.os.Bundle;

public class SimpleFactoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Chart pie = ChartFactory.buildChart("pie");
        pie.construct();
        pie.display();
    }

}
