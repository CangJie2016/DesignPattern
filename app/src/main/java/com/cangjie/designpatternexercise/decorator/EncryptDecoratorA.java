package com.cangjie.designpatternexercise.decorator;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/26 10:43
 * email：cangjie2016@gmail.com
 */
public class EncryptDecoratorA extends Decorator {
    public EncryptDecoratorA(Encrypt encrypt) {
        super(encrypt);
    }

    @Override
    public void encrypt() {
        super.encrypt();
        addedBehavior();
    }

    private void addedBehavior() {
        DebugLog.w("extra encrypt A");
    }
}
