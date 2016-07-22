package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/22 17:50
 * email：cangjie2016@gmail.com
 */
public class ActorController {
    public static Actor construst(ActorBuilder builder){
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        builder.buildCostume();
        builder.buildHairstyle();
        return builder.builder();
    }
}
