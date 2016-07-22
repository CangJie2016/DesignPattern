package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/22 17:47
 * email：cangjie2016@gmail.com
 */
public class EvilBuilder implements ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("Evil");
    }

    @Override
    public void buildSex() {
        actor.setSex("female");
    }

    @Override
    public void buildFace() {
        actor.setFace("Evil face");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("Evil costume");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("Evil hair");
    }

    @Override
    public Actor builder() {
        return actor;
    }
}
