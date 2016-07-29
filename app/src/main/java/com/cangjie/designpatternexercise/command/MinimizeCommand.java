package com.cangjie.designpatternexercise.command;

/**
 * author：CangJie on 2016/7/29 15:25
 * email：cangjie2016@gmail.com
 */
public class MinimizeCommand extends Command {
    WindowHandler handler ;
    public MinimizeCommand() {
        handler = new WindowHandler();
    }

    @Override
    public void execute() {
        handler.minizize();
    }
}
