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
    public void Composite(View view){
        startActivity(new Intent(this, CompositeActivity.class));
    }
    public void Decorator(View view){
        startActivity(new Intent(this, DecoratorActivity.class));
    }
    public void Facade(View view){
        startActivity(new Intent(this, FacadeActivity.class));
    }
    public void FlyWeight(View view){
        startActivity(new Intent(this, FlyWeightActivity.class));
    }
    public void Proxy(View view){
        startActivity(new Intent(this, ProxyActivity.class));
    }
    public void ChainOfResponsibility(View view){
        startActivity(new Intent(this, ChainOfResponsibilityActivity.class));
    }
    public void Command(View view){
        startActivity(new Intent(this, CommandActivity.class));
    }
    public void Interpreter(View view){
        startActivity(new Intent(this, InterpreterActivity.class));
    }
    public void Iterator(View view){
        startActivity(new Intent(this, IteratorActivity.class));
    }

}
