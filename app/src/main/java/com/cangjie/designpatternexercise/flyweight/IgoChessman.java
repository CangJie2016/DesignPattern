package com.cangjie.designpatternexercise.flyweight;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/27 17:03
 * email：cangjie2016@gmail.com
 */
public abstract class IgoChessman {
    public abstract String getColor();
    public void display(Coordinates coordinates){
        DebugLog.w("棋子的颜色:"+this.getColor()+", x = "+coordinates.getX()+" , y = "+coordinates.getY());
    }
}
