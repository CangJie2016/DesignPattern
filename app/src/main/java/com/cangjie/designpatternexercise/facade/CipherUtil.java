package com.cangjie.designpatternexercise.facade;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/26 14:08
 * email：cangjie2016@gmail.com
 */
public class CipherUtil {
    public static String clipher(String str){
        StringBuffer sb = new StringBuffer();
        char[] chars = str.toCharArray();
        for(char cha : chars){
            sb.append((char)(cha + 1));
        }
        return sb.toString();
    }
}
