package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/25 09:41
 * email：cangjie2016@gmail.com
 */
public class ComplePlayerBuilder extends PlayerBuilder {
    @Override
    protected void showMenu() {
        player.setMenu(true);
    }

    @Override
    protected void showPlaylist() {
        player.setPlaylist(true);
    }

    @Override
    protected void showMainWindow() {
        player.setMainWindow(true);
    }

    @Override
    protected void showControllerBar() {
        player.setControllerBar(true);
    }
}
