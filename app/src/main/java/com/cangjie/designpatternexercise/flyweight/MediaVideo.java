package com.cangjie.designpatternexercise.flyweight;

/**
 * author：CangJie on 2016/7/28 16:54
 * email：cangjie2016@gmail.com
 */
public class MediaVideo extends Media {
    public MediaVideo(String name) {
        super(name);
    }

    @Override
    public String getMediaProperty() {
        return "That is video, name is "+fileName;
    }
}
