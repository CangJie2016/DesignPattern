package com.cangjie.designpatternexercise.facade;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * author：CangJie on 2016/7/26 11:30
 * email：cangjie2016@gmail.com
 */
public class ReadFile {
    public static String readFile(String fileName){

        String result = null;
        File file = new File(fileName);

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            int length = fis.available();

            byte [] buffer = new byte[length];
            fis.read(buffer);

            result = new String(buffer,"UTF-8");
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        return result;
    }
}
