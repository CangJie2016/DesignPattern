package com.cangjie.designpatternexercise.bridge;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/25 16:38
 * email：cangjie2016@gmail.com
 */
public class DataChangePdf extends DataChange {
    @Override
    public void change() {
        data.obtainData();
        DebugLog.w("data change pdf");
    }
}
