package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.command.Command;
import com.cangjie.designpatternexercise.command.ConfigOperator;
import com.cangjie.designpatternexercise.command.ConfigSettingWindow;
import com.cangjie.designpatternexercise.command.InsertCommand;
import com.cangjie.designpatternexercise.command.ModifyCommand;
import com.cangjie.designpatternexercise.utils.DebugLog;

public class CommandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
        ConfigSettingWindow window = new ConfigSettingWindow();
        Command command;
        ConfigOperator co = new ConfigOperator();

        command = new InsertCommand("insert");
        command.setConfigOperator(co);
        window.setCommand(command);
        window.call("网站首页");

        command = new InsertCommand("insert");
        command.setConfigOperator(co);
        window.setCommand(command);
        window.call("端口号");

        command = new ModifyCommand("modify");
        command.setConfigOperator(co);
        window.setCommand(command);
        window.call("登录系统");

        DebugLog.w("-------------save-----------");
        window.save();
        DebugLog.w("-------------save-----------");

        DebugLog.w("-------------recover-----------");
        window.recover();
        DebugLog.w("-------------recover-----------");
    }
}
