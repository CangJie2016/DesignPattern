package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/25 09:36
 * email：cangjie2016@gmail.com
 */
public abstract class PlayerBuilder {
    Player player = new Player();
    public Player build(){
        showMenu();
        showPlaylist();
        showMainWindow();
        showControllerBar();
        return player;
    }

    protected abstract void showMenu();
    protected abstract void showPlaylist();
    protected abstract void showMainWindow();
    protected abstract void showControllerBar();
}
