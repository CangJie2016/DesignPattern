package com.cangjie.designpatternexercise.prototype;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/22 17:05
 * email：cangjie2016@gmail.com
 */
public class FARDocument implements OfficialDocument,Cloneable {
    @Override
    public void display() {
        DebugLog.w("It is far document");
    }

    @Override
    public OfficialDocument clone() {
        OfficialDocument doc = null;
        try{
            doc = (OfficialDocument) super.clone();
            return doc;
        }catch (Exception e){
            return null;
        }
    }
}
