package com.cangjie.designpatternexercise;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.cangjie.designpatternexercise.singleton.HungrySingleton;
import com.cangjie.designpatternexercise.singleton.IoDHSingleton;
import com.cangjie.designpatternexercise.singleton.LazySingleton;
import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/21 17:59
 * email：cangjie2016@gmail.com
 */
public class SingletonActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singleton);
    }
    public void HungrySingleton(View view){
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        DebugLog.w((instance1 == instance2)+"");
    }
    public void LazySingleton(View view){
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        DebugLog.w((instance1 == instance2)+"");
    }
    public void IoDH(View view){
        IoDHSingleton instance1 = IoDHSingleton.getInstance();
        IoDHSingleton instance2 = IoDHSingleton.getInstance();
        DebugLog.w((instance1 == instance2)+"");
    }
}
