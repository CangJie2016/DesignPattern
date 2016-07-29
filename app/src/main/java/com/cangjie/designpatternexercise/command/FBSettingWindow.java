package com.cangjie.designpatternexercise.command;

import com.cangjie.designpatternexercise.utils.DebugLog;

import java.util.ArrayList;
import java.util.List;

/**
 * author：CangJie on 2016/7/29 15:18
 * email：cangjie2016@gmail.com
 */
public class FBSettingWindow {
    private String title;
    private List<FunctionButton> functionButtons = new ArrayList<>();

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void addFunctionButton(FunctionButton fb){
        functionButtons.add(fb);
    }
    public void removeFunctionButton(FunctionButton fb){
        functionButtons.remove(fb);
    }
    public void display(){
        DebugLog.w("This is Setting window!  Its title is "+ title);
        for (FunctionButton fb : functionButtons){
            DebugLog.w("This is function button! Its name is "+ fb.getName());
        }
        DebugLog.w("------------------------------------------------");
    }
}
