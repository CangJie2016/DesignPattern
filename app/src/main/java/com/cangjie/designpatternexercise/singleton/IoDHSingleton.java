package com.cangjie.designpatternexercise.singleton;

/**
 * author：CangJie on 2016/7/21 18:05
 * email：cangjie2016@gmail.com
 * IoDH = Initialization Demand Holder
 */
public class IoDHSingleton {
    public static class SingletonHolder{
        public final static IoDHSingleton singleton = new IoDHSingleton();
    }
    public static IoDHSingleton getInstance(){
        return SingletonHolder.singleton;
    }

}
