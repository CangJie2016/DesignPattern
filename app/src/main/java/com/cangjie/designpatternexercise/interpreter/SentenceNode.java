package com.cangjie.designpatternexercise.interpreter;

/**
 * author：CangJie on 2016/8/1 10:01
 * email：cangjie2016@gmail.com
 */
public class SentenceNode extends AbstractNode {
    private AbstractNode directionNode;
    private AbstractNode actionNode;
    private AbstractNode distanceNode;

    public SentenceNode(AbstractNode actionNode, AbstractNode directionNode, AbstractNode distanceNode) {
        this.actionNode = actionNode;
        this.directionNode = directionNode;
        this.distanceNode = distanceNode;
    }
    @Override
    public String interpreter() {
        return directionNode.interpreter() + actionNode.interpreter()  + distanceNode.interpreter();
    }
}
