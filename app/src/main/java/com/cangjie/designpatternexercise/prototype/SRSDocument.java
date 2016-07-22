package com.cangjie.designpatternexercise.prototype;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/22 17:09
 * email：cangjie2016@gmail.com
 */
public class SRSDocument implements OfficialDocument,Cloneable {
    @Override
    public void display() {
        DebugLog.w("It is SRS document");
    }

    @Override
    public OfficialDocument clone() {
        OfficialDocument doc = null;
        try {
            doc = (OfficialDocument) super.clone();
            return doc;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
