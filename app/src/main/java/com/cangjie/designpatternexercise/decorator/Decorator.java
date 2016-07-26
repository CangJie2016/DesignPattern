package com.cangjie.designpatternexercise.decorator;

/**
 * author：CangJie on 2016/7/26 10:42
 * email：cangjie2016@gmail.com
 */
public class Decorator extends Encrypt {
    Encrypt encrypt ;
    public Decorator(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public void encrypt() {
        encrypt.encrypt();
    }
}
