package com.cangjie.designpatternexercise.command;

/**
 * Created by Administrator on 2016/7/30.
 */
public class ModifyCommand extends Command {
    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(args);
    }
}
