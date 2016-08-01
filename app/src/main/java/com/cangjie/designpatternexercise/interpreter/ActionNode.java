package com.cangjie.designpatternexercise.interpreter;

/**
 * author：CangJie on 2016/8/1 10:03
 * email：cangjie2016@gmail.com
 */
public class ActionNode extends AbstractNode {
    private String action;

    public ActionNode(String action) {
        this.action = action;
    }

    @Override
    public String interpreter() {
        String actionStr = null;
        if("move".equals(action)){
            actionStr = "移动";
        }else if("run".equals(action)){
            actionStr = "快速移动";
        }else{
            actionStr = "无效指令";
        }
        return actionStr;
    }
}
