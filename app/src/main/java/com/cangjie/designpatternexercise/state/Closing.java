package com.cangjie.designpatternexercise.state;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/8/4 15:00
 * email：cangjie2016@gmail.com
 */
public class Closing extends State {
    @Override
    public void display() {
        DebugLog.w("closing");
    }
}
