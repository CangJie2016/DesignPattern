package com.cangjie.designpatternexercise.singleton;

/**
 * author：CangJie on 2016/7/21 18:02
 * email：cangjie2016@gmail.com
 */
public class LazySingleton {
    private static LazySingleton singleton;
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(singleton == null){
            synchronized (LazySingleton.class){
                if(singleton == null)
                    singleton = new LazySingleton();
            }
        }
        return singleton;
    }

}
