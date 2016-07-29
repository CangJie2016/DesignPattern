package com.cangjie.designpatternexercise.chain;

/**
 * author：CangJie on 2016/7/29 11:27
 * email：cangjie2016@gmail.com
 */
public abstract class Employee {
    protected Employee employee;
    protected String name;

    public Employee(String name){
        this.name = name;
    }
    public void setEmployee(Employee employee){
        this.employee = employee;
    }
    public abstract void approve(int day);
}
