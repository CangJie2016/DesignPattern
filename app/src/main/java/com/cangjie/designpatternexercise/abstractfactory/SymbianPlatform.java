package com.cangjie.designpatternexercise.abstractfactory;

/**
 * author：CangJie on 2016/7/21 15:20
 * email：cangjie2016@gmail.com
 */
public class SymbianPlatform implements Platform {
    @Override
    public Controller buildOperationController() {
        return new SymbianOperationController();
    }

    @Override
    public Controller buildInterfaceController() {
        return new SymbianInterfaceController();
    }
}
