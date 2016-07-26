package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.decorator.Encrypt;
import com.cangjie.designpatternexercise.decorator.EncryptDecoratorA;
import com.cangjie.designpatternexercise.decorator.EncryptDecoratorB;
import com.cangjie.designpatternexercise.decorator.PasswordEncrypt;

public class DecoratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decorator);
        Encrypt encrypt,decoratorA,decoratorB;
        encrypt = new PasswordEncrypt();
        decoratorA = new EncryptDecoratorA(encrypt);
        decoratorA.encrypt();
        decoratorB = new EncryptDecoratorB(decoratorA);
        decoratorB.encrypt();
    }
}
