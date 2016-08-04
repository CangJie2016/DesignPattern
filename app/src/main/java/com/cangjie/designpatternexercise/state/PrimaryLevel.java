package com.cangjie.designpatternexercise.state;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/8/4 14:28
 * email：cangjie2016@gmail.com
 */
public class PrimaryLevel extends Level {
    @Override
    public void play() {
        DebugLog.w("玩游戏吧");
    }
}
