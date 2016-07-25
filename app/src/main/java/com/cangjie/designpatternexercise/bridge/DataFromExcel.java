package com.cangjie.designpatternexercise.bridge;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/25 16:43
 * email：cangjie2016@gmail.com
 */
public class DataFromExcel implements DataFrom {
    NotKnowData data = new NotKnowData();
    @Override
    public void obtainData() {
        DebugLog.w("data from excel, but i need call not know library!!"
                + data.readData(null));
    }
}
