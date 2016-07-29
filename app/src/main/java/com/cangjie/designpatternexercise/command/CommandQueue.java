package com.cangjie.designpatternexercise.command;

import java.util.ArrayList;
import java.util.List;

/**
 * author：CangJie on 2016/7/29 15:43
 * email：cangjie2016@gmail.com
 */
public class CommandQueue {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command){
        commands.add(command);
    }
    public void removeCommand(Command command){
        commands.remove(command);
    }
    public void call(){
        for (Command command : commands)
            command.execute();
    }
}
