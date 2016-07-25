package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/25 09:43
 * email：cangjie2016@gmail.com
 */
public class MoviePlayerBuilder extends PlayerBuilder{

    @Override
    protected void showMenu() {
        player.setMenu(false);
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
        player.setControllerBar(false);
    }
}
