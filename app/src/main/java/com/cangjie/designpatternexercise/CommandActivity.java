package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.command.Command;
import com.cangjie.designpatternexercise.command.CommandQueue;
import com.cangjie.designpatternexercise.command.FBSettingWindow;
import com.cangjie.designpatternexercise.command.FunctionButton;
import com.cangjie.designpatternexercise.command.HelpCommand;
import com.cangjie.designpatternexercise.command.MinimizeCommand;

public class CommandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
        FBSettingWindow window = new FBSettingWindow("super man");
        FunctionButton fb1 = new FunctionButton("minimize btn");
        FunctionButton fb2 = new FunctionButton("help btn");

        Command helpCommand = new HelpCommand();
        Command minimizeCommand = new MinimizeCommand();

        CommandQueue queue = new CommandQueue();
        queue.addCommand(helpCommand);
        queue.addCommand(minimizeCommand);

        fb1.setQueue(queue);

//        fb2.setCommands(helpCommand);


        window.addFunctionButton(fb1);
//        window.addFunctionButton(fb2);

        window.display();
        fb1.onClick();
//        fb2.onClick();
    }
}
