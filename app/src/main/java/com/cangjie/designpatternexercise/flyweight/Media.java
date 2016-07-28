package com.cangjie.designpatternexercise.flyweight;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/28 16:48
 * email：cangjie2016@gmail.com
 */
public abstract class Media {
    String fileName;
    public Media(String name){
        fileName = name;
    }

    public abstract String getMediaProperty();

    public void display(PositionAndSize positionAndSize){
        DebugLog.w(getMediaProperty() + ", position = "+ positionAndSize.getPosition()+" , size = "+positionAndSize.getSize());
    }
}
