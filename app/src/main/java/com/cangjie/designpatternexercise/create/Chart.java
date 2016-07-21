package com.cangjie.designpatternexercise.create;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/19 17:13
 * email：cangjie2016@gmail.com
 */
public abstract class Chart {
    public void display(){
        DebugLog.w("display");
    }
    public abstract void construct();

}
