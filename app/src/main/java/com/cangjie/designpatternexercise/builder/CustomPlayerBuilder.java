package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/25 09:42
 * email：cangjie2016@gmail.com
 */
public class CustomPlayerBuilder extends PlayerBuilder {

    @Override
    protected void showMenu() {
        player.setMenu(true);
    }

    @Override
    protected void showPlaylist() {
        player.setPlaylist(false);
    }

    @Override
    protected void showMainWindow() {
        player.setMainWindow(false);
    }

    @Override
    protected void showControllerBar() {
        player.setControllerBar(true);
    }
}
