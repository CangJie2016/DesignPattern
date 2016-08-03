package com.cangjie.designpatternexercise.memento;

/**
 * author：CangJie on 2016/8/3 10:53
 * email：cangjie2016@gmail.com
 */
public class PlayerCaretaker {
    private PlayerMemento playerMemento;

    public PlayerMemento getPlayerMemento() {
        return playerMemento;
    }

    public void setPlayerMemento(PlayerMemento playerMemento) {
        this.playerMemento = playerMemento;
    }
}
