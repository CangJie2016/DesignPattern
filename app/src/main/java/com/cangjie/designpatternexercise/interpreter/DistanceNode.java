package com.cangjie.designpatternexercise.interpreter;

/**
 * author：CangJie on 2016/8/1 10:07
 * email：cangjie2016@gmail.com
 */
public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpreter() {
        try{
            Double.parseDouble(distance);

            return distance;
        }catch (Exception e){
            return "无效指令";
        }
    }
}
