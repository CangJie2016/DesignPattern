package com.cangjie.designpatternexercise.command;

import java.util.ArrayList;
import java.util.List;

/**
 * author：CangJie on 2016/7/29 16:05
 * email：cangjie2016@gmail.com
 */
public class AddCommand extends Command{
    private AddHelper helper ;
    private List<Integer> previousValue = new ArrayList<>();
    private int currentFlag = 0;
    public AddCommand() {
        helper = new AddHelper();
    }

    @Override
    public void execute(int value) {
        // 当有新操作运算进来,移除当前标记位置后的所有历史操作
        previousValue = previousValue.subList(0,currentFlag);

        currentFlag++;
        previousValue.add(value);
        helper.add(value);
    }

    @Override
    public void undo() {
        if(currentFlag == 0)
            return;
        currentFlag --;
        helper.add(- previousValue.get(currentFlag));
    }

    @Override
    public void redo() {
        if(currentFlag == previousValue.size())
            return;
        helper.add(previousValue.get(currentFlag));
        currentFlag ++;
    }

}
