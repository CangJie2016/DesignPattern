package com.cangjie.designpatternexercise.flyweight;

import java.util.HashMap;

/**
 * author：CangJie on 2016/7/28 16:55
 * email：cangjie2016@gmail.com
 */
public class MediaFactory {
    private HashMap<String,Media> mData = new HashMap<>();
    private MediaFactory() {
        mData.put("earth",new MediaPhoto("Earth"));
        mData.put("Uptown Funk",new MediaVideo("Uptown Funk"));
        mData.put("Tom",new MediaCartoon("Tom"));
    }
    private static class FactoryHolder{
        private static MediaFactory instance = new MediaFactory();
        private static MediaFactory getInstance(){
            return instance;
        }
    }
    public static MediaFactory getInstance(){
        return FactoryHolder.getInstance();
    }
    public Media getMedia(String key){
        if(mData.containsKey(key)){
            return mData.get(key);
        }else{
            return null;
        }
    }
    public void setMedia(String key,Media media){
        mData.put(key,media);
    }

}
