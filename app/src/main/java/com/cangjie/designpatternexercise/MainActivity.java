package com.cangjie.designpatternexercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.cangjie.designpatternexercise.create.SimpleFactoryActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleFactoryPattern(View view){
        startActivity(new Intent(this, SimpleFactoryActivity.class));
    }
}
