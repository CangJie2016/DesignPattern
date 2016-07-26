package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.facade.AbstractEncryptFacade;
import com.cangjie.designpatternexercise.facade.NewEncryptFacade;

public class FacadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facade);
        AbstractEncryptFacade encryptFacade = new NewEncryptFacade();
        String filePath = Environment.getExternalStorageDirectory()+"/hell.txt";
        encryptFacade.encrypt(filePath);
    }
}
