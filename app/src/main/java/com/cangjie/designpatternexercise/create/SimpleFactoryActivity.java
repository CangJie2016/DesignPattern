package com.cangjie.designpatternexercise.create;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ImageView;

import com.cangjie.designpatternexercise.R;
import com.cangjie.designpatternexercise.utils.XMLUtil;

public class SimpleFactoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_factory);
        ImageView iv = (ImageView) findViewById(R.id.iv);
        ReaderFactory factory = (ReaderFactory)XMLUtil.obtainFactory(this);
        String photoPath = Environment.getExternalStorageDirectory().getAbsolutePath()+"/pic.png";
        factory.readSize(photoPath);
        iv.setImageBitmap(factory.readBitmap(photoPath));
    }

}
