package com.cangjie.designpatternexercise.command;

/**
 * author：CangJie on 2016/7/29 15:22
 * email：cangjie2016@gmail.com
 */
public abstract class Command {
    public abstract void execute(int value);
    public abstract void undo();
    public abstract void redo();
}
