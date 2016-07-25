package com.cangjie.designpatternexercise.adapter;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/25 11:19
 * email：cangjie2016@gmail.com
 */
public class SunnyEncryty {
    public void encrytyPassword(String password){
        DebugLog.w(password+" --- > 口令加密");
    }
    public void encrytyEmail(String email){
        DebugLog.w(email +" --- > 邮箱加密");
    }
}
