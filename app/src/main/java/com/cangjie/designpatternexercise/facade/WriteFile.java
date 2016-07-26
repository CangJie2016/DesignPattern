package com.cangjie.designpatternexercise.facade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * author：CangJie on 2016/7/26 14:13
 * email：cangjie2016@gmail.com
 */
public class WriteFile {
    public static void writeFile(String filePath,String str){
        File file = new File(filePath);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
