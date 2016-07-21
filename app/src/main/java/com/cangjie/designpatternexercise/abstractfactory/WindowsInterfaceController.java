package com.cangjie.designpatternexercise.abstractfactory;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/21 15:22
 * email：cangjie2016@gmail.com
 */
public class WindowsInterfaceController implements Controller {
    @Override
    public void display() {
        DebugLog.w("windows interface");
    }
}
