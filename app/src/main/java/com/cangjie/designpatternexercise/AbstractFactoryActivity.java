package com.cangjie.designpatternexercise;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.cangjie.designpatternexercise.abstractfactory.Controller;
import com.cangjie.designpatternexercise.abstractfactory.Platform;
import com.cangjie.designpatternexercise.utils.XMLUtil;

/**
 * author：CangJie on 2016/7/21 15:07
 * email：cangjie2016@gmail.com
 */
public class AbstractFactoryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstract_factory);
        TextView tv = (TextView) findViewById(R.id.tv);
        Button btn = (Button) findViewById(R.id.btn);

        Platform platform = (Platform)XMLUtil.obtainFactory(this);
        Controller controller = platform.buildInterfaceController();
        controller.display();
        Controller controller1 = platform.buildOperationController();
        controller1.display();
    }
}
