package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.mediator.Button;
import com.cangjie.designpatternexercise.mediator.Component;
import com.cangjie.designpatternexercise.mediator.TextView;
import com.cangjie.designpatternexercise.mediator.UIMediator;

public class MediatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mediator);
        UIMediator mediator = new UIMediator();
        Component btn = new Button(mediator);
        mediator.setBtn(btn);

        Component tv = new TextView(mediator);
        mediator.setTv(tv);

        btn.method1();
        tv.method1();
    }
}
