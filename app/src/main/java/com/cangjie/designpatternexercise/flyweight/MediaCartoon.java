package com.cangjie.designpatternexercise.flyweight;

/**
 * author：CangJie on 2016/7/28 16:52
 * email：cangjie2016@gmail.com
 */
public class MediaCartoon extends Media {

    public MediaCartoon(String name) {
        super(name);
    }

    @Override
    public String getMediaProperty() {
        return "That is cartoon, name is "+fileName;
    }
}
