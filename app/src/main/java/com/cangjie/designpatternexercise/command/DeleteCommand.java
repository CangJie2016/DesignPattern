package com.cangjie.designpatternexercise.command;

/**
 * Created by Administrator on 2016/7/30.
 */
public class DeleteCommand extends Command {
    public DeleteCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.delete(args);
    }

    @Override
    public void execute() {
        configOperator.delete(args);
    }
}
