package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/22 17:47
 * email：cangjie2016@gmail.com
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("Angel");
    }

    @Override
    public void buildSex() {
        actor.setSex("female");
    }

    @Override
    public void buildFace() {
        actor.setFace("Angel face");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("Angel costume");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("Angel hair");
    }

}
