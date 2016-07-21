package com.cangjie.designpatternexercise.create;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * author：CangJie on 2016/7/21 11:27
 * email：cangjie2016@gmail.com
 */
public abstract class Reader {
    protected Bitmap bitmap;

    public Reader(String photoPath){
        bitmap = BitmapFactory.decodeFile(photoPath);
    }
    protected abstract void readSize();
    protected abstract Bitmap readBitmap();
}
