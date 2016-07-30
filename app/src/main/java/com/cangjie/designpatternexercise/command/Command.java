package com.cangjie.designpatternexercise.command;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/30.
 */
public abstract class Command implements Serializable {
    protected String name;
    protected String args;
    protected ConfigOperator configOperator;

    public Command(String name) {
        this.name = name;
    }

    public void setConfigOperator(ConfigOperator configOperator) {
        this.configOperator = configOperator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }
    public abstract void execute(String args);
    public abstract void execute();
}
