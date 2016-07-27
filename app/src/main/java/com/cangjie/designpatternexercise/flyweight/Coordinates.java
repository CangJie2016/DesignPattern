package com.cangjie.designpatternexercise.flyweight;

/**
 * author：CangJie on 2016/7/27 17:30
 * email：cangjie2016@gmail.com
 */
public class Coordinates {
    private int x,y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
