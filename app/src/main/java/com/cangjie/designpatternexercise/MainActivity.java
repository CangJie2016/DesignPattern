package com.cangjie.designpatternexercise;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void simpleFactoryPattern(View view){
        startActivity(new Intent(this, SimpleFactoryActivity.class));
    }
    public void AbstractFactoryPattern(View view){
        startActivity(new Intent(this, AbstractFactoryActivity.class));
    }
    public void Singleton(View view){
        startActivity(new Intent(this, SingletonActivity.class));
    }

    public void Prototype(View view){
        startActivity(new Intent(this, PrototypeActivity.class));
    }
    public void Builder(View view) {
        startActivity(new Intent(this, BuilderActivity.class));
    }
    public void Adapter(View view){
        startActivity(new Intent(this, AdapterActivity.class));
    }

}
