package com.cangjie.designpatternexercise.interpreter;

/**
 * author：CangJie on 2016/8/1 10:05
 * email：cangjie2016@gmail.com
 */
public class DirectionNode extends AbstractNode {
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpreter() {
        String actionStr = null;
        if("up".equals(direction)){
            actionStr = "向上";
        }else if("down".equals(direction)){
            actionStr = "向下";
        }else if("left".equals(direction)){
            actionStr = "向左";
        }else if("right".equals(direction)){
            actionStr = "向右";
        }else{
            actionStr = "无效指令";
        }
        return actionStr;
    }
}
