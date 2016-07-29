package com.cangjie.designpatternexercise.command;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/29 16:05
 * email：cangjie2016@gmail.com
 */
public class AddHelper {
    private int sum = 0;
    public void add(int value){
        sum += value;
        DebugLog.w("sum"+sum+"");
    }
}
