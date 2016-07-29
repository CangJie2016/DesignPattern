package com.cangjie.designpatternexercise.chain;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/29 11:29
 * email：cangjie2016@gmail.com
 */
public class Director extends Employee {
    public Director(String name) {
        super(name);
    }

    @Override
    public void approve(int day) {
        if(day < 3){
            DebugLog.w(name + "主任审批成功,共计请假"+day +"天!!");
        }else{
            this.employee.approve(day);
        }
    }
}
