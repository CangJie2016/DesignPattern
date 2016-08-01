package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.interpreter.InterpreterHandler;
import com.cangjie.designpatternexercise.utils.DebugLog;

public class InterpreterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interpreter);
        String str = InterpreterHandler.interpreter("up move 100 and down run 20");
        DebugLog.w(str);
    }
}
