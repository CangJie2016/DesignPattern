package com.cangjie.designpatternexercise.interpreter;

/**
 * author：CangJie on 2016/8/1 09:58
 * email：cangjie2016@gmail.com
 */
public class AndNode extends AbstractNode {
    private AbstractNode left;
    private AbstractNode right;
    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String interpreter() {
        return left.interpreter() + "再" + right.interpreter();
    }
}
