package com.cangjie.designpatternexercise.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/7/30.
 */
public class ConfigSettingWindow {
    private List<Command> commands = new ArrayList<>();
    private Command command ;
    public void setCommand (Command command){
        this.command = command;
    }
    public void call(String args){
        command.execute(args);
        commands.add(command);
    }
    //记录请求日志，生成日志文件，将命令集合写入日志文件
    public void save() {
        FileUtil.writeCommands(commands);
    }

    //从日志文件中提取命令集合，并循环调用每一个命令对象的execute()方法来实现配置文件的重新设置
    public void recover() {
        ArrayList list;
        list = FileUtil.readCommands();

        for (Object obj : list) {
            ((Command)obj).execute();
        }
    }
}
