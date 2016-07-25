package com.cangjie.designpatternexercise.bridge;

/**
 * author：CangJie on 2016/7/25 16:34
 * email：cangjie2016@gmail.com
 */
public abstract class DataChange {
    DataFrom data;
    public void setData(DataFrom data){
        this.data = data;
    }
    public abstract void change();
}
