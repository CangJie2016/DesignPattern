package com.cangjie.designpatternexercise.flyweight;

import java.util.HashMap;

/**
 * author：CangJie on 2016/7/27 16:53
 * email：cangjie2016@gmail.com
 */
public class IgoChessmanFactory {
    private HashMap<String,IgoChessman> mData;
    private IgoChessmanFactory(){
        mData = new HashMap<>();
        mData.put("black",new BlackIgoChessman());
        mData.put("white",new WhiteIgoChessman());
    }

    public IgoChessman getIgoChessman(String key){
        if(mData.containsKey(key)){
            return mData.get(key);
        }
        return null;
    }

    private static class FactoryHolder{
        private static IgoChessmanFactory instance = new IgoChessmanFactory();
        public static IgoChessmanFactory getInstance(){
            return instance;
        }
    }
    public static IgoChessmanFactory getInstance(){
        return FactoryHolder.getInstance();
    }


}
