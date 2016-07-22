package com.cangjie.designpatternexercise.utils;

import android.content.Context;

import com.cangjie.designpatternexercise.R;

/**
 * author：CangJie on 2016/7/21 10:48
 * email：cangjie2016@gmail.com
 */
public class XMLUtil {
    public static Object obtainFactory(Context context){

        String className = context.getResources().getString(R.string.config_factory);
        Object newInstance = null;
        try {
            Class aClass = Class.forName(className);
            newInstance = aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newInstance;
    }
    public static Object obtainBuilder(Context context){

        String className = context.getResources().getString(R.string.config_builder);
        Object newInstance = null;
        try {
            Class aClass = Class.forName(className);
            newInstance = aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return newInstance;
    }
}
