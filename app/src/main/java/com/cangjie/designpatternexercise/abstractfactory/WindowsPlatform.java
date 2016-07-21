package com.cangjie.designpatternexercise.abstractfactory;

/**
 * author：CangJie on 2016/7/21 15:22
 * email：cangjie2016@gmail.com
 */
public class WindowsPlatform implements Platform {
    @Override
    public Controller buildOperationController() {
        return new WindowsOperationController();
    }

    @Override
    public Controller buildInterfaceController() {
        return new WindowsInterfaceController();
    }
}
