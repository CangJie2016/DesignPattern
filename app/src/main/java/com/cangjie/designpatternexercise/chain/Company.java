package com.cangjie.designpatternexercise.chain;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/29 11:29
 * email：cangjie2016@gmail.com
 */
public class Company extends Employee {
    public Company(String name) {
        super(name);
    }

    @Override
    public void approve(int day) {
        if(day > 30){
            DebugLog.w("需请假"+day +"天,请假失败");
        }else{
            this.employee.approve(day);
        }
    }
}
