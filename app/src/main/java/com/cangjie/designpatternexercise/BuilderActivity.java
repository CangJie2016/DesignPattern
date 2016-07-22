package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.builder.Actor;
import com.cangjie.designpatternexercise.builder.ActorBuilder;
import com.cangjie.designpatternexercise.builder.ActorController;
import com.cangjie.designpatternexercise.utils.DebugLog;
import com.cangjie.designpatternexercise.utils.XMLUtil;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        Actor construst = ActorController.construst((ActorBuilder) XMLUtil.obtainBuilder(this));
        DebugLog.w(construst.toString());
    }
}
