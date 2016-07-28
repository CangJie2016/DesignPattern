package com.cangjie.designpatternexercise.flyweight;

/**
 * author：CangJie on 2016/7/28 16:49
 * email：cangjie2016@gmail.com
 */
public class PositionAndSize {
    private String position;
    private String size;

    public PositionAndSize(String position, String size) {
        this.position = position;
        this.size = size;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
