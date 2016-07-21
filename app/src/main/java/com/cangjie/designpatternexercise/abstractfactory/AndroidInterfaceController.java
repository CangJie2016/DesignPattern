package com.cangjie.designpatternexercise.abstractfactory;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/21 15:18
 * email：cangjie2016@gmail.com
 */
public class AndroidInterfaceController implements Controller{
    public void display(){
        DebugLog.w("Android Interface");
    }
}
