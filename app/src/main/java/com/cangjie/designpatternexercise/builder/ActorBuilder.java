package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/22 17:46
 * email：cangjie2016@gmail.com
 */
public abstract class ActorBuilder {
    Actor actor = new Actor();
    abstract void buildType();
    abstract void buildSex();
    abstract void buildFace();
    abstract void buildCostume();
    abstract void buildHairstyle();
    public Actor construct(){
        buildType();
        buildFace();
        buildSex();
        buildCostume();
        buildHairstyle();
        return actor;
    }

}
