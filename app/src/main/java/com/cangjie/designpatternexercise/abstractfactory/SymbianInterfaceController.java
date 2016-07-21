package com.cangjie.designpatternexercise.abstractfactory;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/21 15:20
 * email：cangjie2016@gmail.com
 */
public class SymbianInterfaceController implements Controller {
    public void display(){
        DebugLog.w("Symbian interface");
    }
}
