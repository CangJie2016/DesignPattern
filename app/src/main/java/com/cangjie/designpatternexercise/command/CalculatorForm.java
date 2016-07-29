package com.cangjie.designpatternexercise.command;

/**
 * author：CangJie on 2016/7/29 16:03
 * email：cangjie2016@gmail.com
 */
public class CalculatorForm {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void compute(int value){
        command.execute(value);
    }
    public void undo(){
        command.undo();
    }
    public void redo(){
        command.redo();
    }
}
