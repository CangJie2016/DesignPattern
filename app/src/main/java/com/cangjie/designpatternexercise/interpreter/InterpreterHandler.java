package com.cangjie.designpatternexercise.interpreter;

import java.util.Stack;

/**
 * author：CangJie on 2016/8/1 10:09
 * email：cangjie2016@gmail.com
 */
public class InterpreterHandler {
    public static String interpreter(String str){
        String[] words = str.split(" ");
        AbstractNode andNode, sentenceNode, actionNode, directionNode, distanceNode;
        Stack<AbstractNode> stack = new Stack<>();
        for(int i = 0;i< words.length - 1;){
            if("and".equals(words[i])){
                i++;
                directionNode = new DirectionNode(words[i++]);
                actionNode = new ActionNode(words[i++]);
                distanceNode = new DistanceNode(words[i++]);
                sentenceNode = new SentenceNode(actionNode,directionNode,distanceNode);
                andNode = new AndNode(stack.pop(),sentenceNode);
                stack.push(andNode);
            }else{
                directionNode = new DirectionNode(words[i++]);
                actionNode = new ActionNode(words[i++]);
                distanceNode = new DistanceNode(words[i++]);
                sentenceNode = new SentenceNode(actionNode,directionNode,distanceNode);
                stack.push(sentenceNode);
            }
        }
        return stack.pop().interpreter();
    }
}
