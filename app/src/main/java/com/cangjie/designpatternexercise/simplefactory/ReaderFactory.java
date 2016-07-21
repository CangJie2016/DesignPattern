package com.cangjie.designpatternexercise.simplefactory;

import android.graphics.Bitmap;

/**
 * author：CangJie on 2016/7/21 11:34
 * email：cangjie2016@gmail.com
 */
public interface ReaderFactory {
    Reader buildReader(String photoPath);
    void readSize(String photoPath);
    Bitmap readBitmap(String photoPath);
}
