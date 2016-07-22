package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/22 17:46
 * email：cangjie2016@gmail.com
 */
public interface ActorBuilder {
    Actor actor = new Actor();
    void buildType();
    void buildSex();
    void buildFace();
    void buildCostume();
    void buildHairstyle();
    Actor builder();
}
