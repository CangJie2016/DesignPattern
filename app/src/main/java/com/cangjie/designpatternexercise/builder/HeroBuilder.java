package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/22 17:47
 * email：cangjie2016@gmail.com
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("Hero");
    }

    @Override
    public void buildSex() {
        actor.setSex("male");
    }

    @Override
    public void buildFace() {
        actor.setFace("hero face");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("hero costume");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("hero hair");
    }

}
