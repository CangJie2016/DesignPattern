package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cangjie.designpatternexercise.state.TransformGate;

public class StateActivity extends AppCompatActivity {

    private TransformGate gate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        gate = new TransformGate("Tony");
    }
    public void click(View view){
        gate.click();
    }
    public void timeOut(View view){
        gate.timeout();
    }
    public void complete(View view){
        gate.complete();
    }
}
