package com.cangjie.designpatternexercise.abstractfactory;

/**
 * author：CangJie on 2016/7/21 15:11
 * email：cangjie2016@gmail.com
 */
public class AndroidPlatform implements Platform {
    @Override
    public Controller buildOperationController() {
        return new AndroidOperationController();
    }

    @Override
    public Controller buildInterfaceController() {
        return new AndroidInterfaceController();
    }
}
