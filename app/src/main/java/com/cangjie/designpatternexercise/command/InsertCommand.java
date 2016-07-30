package com.cangjie.designpatternexercise.command;

/**
 * Created by Administrator on 2016/7/30.
 */
public class InsertCommand extends Command {
    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }

    @Override
    public void execute() {
        configOperator.insert(args);
    }
}
