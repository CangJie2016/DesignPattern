package com.cangjie.designpatternexercise.decorator;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/26 10:42
 * email：cangjie2016@gmail.com
 */
public class EmailEncrypt extends Encrypt {
    @Override
    public void encrypt() {
        DebugLog.w("encrypt email !!!");
    }
}
