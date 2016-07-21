package com.cangjie.designpatternexercise.create;

import android.graphics.Bitmap;

/**
 * author：CangJie on 2016/7/21 11:35
 * email：cangjie2016@gmail.com
 */
public class GIFReaderFactory implements ReaderFactory {

    @Override
    public Reader buildReader(String photoPath) {
        return new GIFReader(photoPath);
    }

    @Override
    public void readSize(String photoPath) {
        buildReader(photoPath).readSize();
    }

    @Override
    public Bitmap readBitmap(String photoPath) {
        return buildReader(photoPath).readBitmap();
    }

}
