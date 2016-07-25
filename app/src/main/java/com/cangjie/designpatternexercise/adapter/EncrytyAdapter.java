package com.cangjie.designpatternexercise.adapter;

/**
 * author：CangJie on 2016/7/25 11:21
 * email：cangjie2016@gmail.com
 */
public class EncrytyAdapter implements Encryty {

    private final SunnyEncryty encryty;

    public EncrytyAdapter() {
        encryty = new SunnyEncryty();
    }

    @Override
    public void password(String password) {
        encryty.encrytyPassword(password);
    }

    @Override
    public void email(String email) {
        encryty.encrytyEmail(email);
    }
}
