package com.cangjie.designpatternexercise.prototype;

import java.util.HashMap;

/**
 * author：CangJie on 2016/7/22 17:11
 * email：cangjie2016@gmail.com
 */
public class PrototypeManager {
    private static PrototypeManager instance = new PrototypeManager();
    private HashMap<String,OfficialDocument> hashMap = new HashMap<>();

    private PrototypeManager(){
        hashMap.put("far",new FARDocument());
        hashMap.put("srs",new SRSDocument());
        hashMap.put("ppr",new PPRDocument());
    }

    public OfficialDocument obtainDocument(String type){
        return hashMap.get(type).clone();
    }

    // 保存类型
    public static PrototypeManager getInstance(){
        return instance;
    }
}
