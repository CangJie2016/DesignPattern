package com.cangjie.designpatternexercise.simplefactory;

import android.graphics.Bitmap;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/7/21 11:33
 * email：cangjie2016@gmail.com
 */
public class GIFReader extends Reader {
    public GIFReader(String photoPath) {
        super(photoPath);
    }

    @Override
    protected void readSize() {
        DebugLog.w("GIF size : "+bitmap.getRowBytes());
    }

    @Override
    protected Bitmap readBitmap() {
        return bitmap;
    }
}
