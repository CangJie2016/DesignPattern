package com.cangjie.designpatternexercise.proxy;

import com.cangjie.designpatternexercise.utils.DebugLog;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author：CangJie on 2016/7/28 17:54
 * email：cangjie2016@gmail.com
 */
public class RealWork extends Work {
    @Override
    public void work() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DebugLog.w("方法Method()被调用，调用时间为"+sdf.format(date));
    }
}
