package com.cangjie.designpatternexercise.command;

/**
 * author：CangJie on 2016/7/29 15:19
 * email：cangjie2016@gmail.com
 */
public class FunctionButton {
    private Command command;
    private String name;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void onClick(){
        command.execute();
    }

}
