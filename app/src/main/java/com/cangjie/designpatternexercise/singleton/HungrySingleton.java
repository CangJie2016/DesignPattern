package com.cangjie.designpatternexercise.singleton;

/**
 * author：CangJie on 2016/7/21 18:01
 * email：cangjie2016@gmail.com
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance(){
        return singleton;
    }
}
