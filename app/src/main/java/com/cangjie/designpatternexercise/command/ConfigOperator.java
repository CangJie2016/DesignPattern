package com.cangjie.designpatternexercise.command;

import com.cangjie.designpatternexercise.utils.DebugLog;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/30.
 */
public class ConfigOperator implements Serializable{
    public void insert(String args){
        DebugLog.w("insert operator "+args);
    }
    public void modify(String args){
        DebugLog.w("modify operator "+args);
    }
    public void delete(String args){
        DebugLog.w("delete operator "+args);
    }
}
