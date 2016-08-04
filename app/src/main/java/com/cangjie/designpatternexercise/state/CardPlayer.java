package com.cangjie.designpatternexercise.state;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/8/4 14:26
 * email：cangjie2016@gmail.com
 */
public class CardPlayer {
    private String name;
    private Level level;

    public CardPlayer(String name) {
        this.name = name;
        this.level = new PrimaryLevel();
    }

    public void upLevel(){
        if(level.getClass() == PrimaryLevel.class){
            DebugLog.w(name+"升级为熟练玩家");
            level = new SecondaryLevel();
        }else if(level.getClass() == SecondaryLevel.class){
            DebugLog.w(name+"升级为高手玩家");
            level = new ProfessionalLevel();
        }else {
            DebugLog.w("等级已经为最大,无法继续提升");
        }
    }

    public void play(){
        level.play();
    }
}
