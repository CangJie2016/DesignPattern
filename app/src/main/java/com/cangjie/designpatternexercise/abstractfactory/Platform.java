package com.cangjie.designpatternexercise.abstractfactory;

/**
 * author：CangJie on 2016/7/21 15:10
 * email：cangjie2016@gmail.com
 */
public interface Platform {
    Controller buildOperationController();
    Controller buildInterfaceController();

}
