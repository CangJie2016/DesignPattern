package com.cangjie.designpatternexercise.facade;

/**
 * author：CangJie on 2016/7/26 14:38
 * email：cangjie2016@gmail.com
 */
public class NewEncryptFacade extends AbstractEncryptFacade{

    public void encrypt(String filePath){
        String result = ReadFile.readFile(filePath);
        result = NewCipherUtil.clipher(result);
        WriteFile.writeFile(filePath,result);
    }
}
