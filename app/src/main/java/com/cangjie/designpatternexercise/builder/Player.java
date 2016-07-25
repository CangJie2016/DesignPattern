package com.cangjie.designpatternexercise.builder;

/**
 * author：CangJie on 2016/7/25 09:34
 * email：cangjie2016@gmail.com
 */
public class Player {
    private boolean menu;
    private boolean playlist;
    private boolean mainWindow;
    private boolean controllerBar;

    public boolean isMenu() {
        return menu;
    }

    public void setMenu(boolean menu) {
        this.menu = menu;
    }

    public boolean isPlaylist() {
        return playlist;
    }

    public void setPlaylist(boolean playlist) {
        this.playlist = playlist;
    }

    public boolean isMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(boolean mainWindow) {
        this.mainWindow = mainWindow;
    }

    public boolean isControllerBar() {
        return controllerBar;
    }

    public void setControllerBar(boolean controllerBar) {
        this.controllerBar = controllerBar;
    }

    @Override
    public String toString() {
        return "Player{" +
                "menu=" + menu +
                ", playlist=" + playlist +
                ", mainWindow=" + mainWindow +
                ", controllerBar=" + controllerBar +
                '}';
    }
}
