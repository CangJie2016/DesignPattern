package com.cangjie.designpatternexercise.command;

/**
 * author：CangJie on 2016/7/29 15:28
 * email：cangjie2016@gmail.com
 */
public class HelpCommand extends Command {
    private HelpHandler helpHandler;
    public HelpCommand() {
        helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.help();
    }
}
