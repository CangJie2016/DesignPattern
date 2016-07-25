package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.adapter.Encryty;
import com.cangjie.designpatternexercise.adapter.EncrytyAdapter;

public class AdapterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);
        Encryty encryty = new EncrytyAdapter();
        encryty.email("cangjie2016@gmail.com");
        encryty.password("hello world");
    }
}
