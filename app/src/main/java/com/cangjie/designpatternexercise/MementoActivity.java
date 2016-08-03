package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.memento.PlayerCaretaker;
import com.cangjie.designpatternexercise.memento.PlayerState;
import com.cangjie.designpatternexercise.utils.DebugLog;

public class MementoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memento);
        PlayerState playerState = new PlayerState(0,0,3,"Tony");
        PlayerCaretaker caretaker = new PlayerCaretaker();
        caretaker.setPlayerMemento(playerState.storeMemento());
        DebugLog.w("------------init-------------");
        DebugLog.w(playerState.toString());

        playerState.setScore(1000);
        playerState.setDistance(100);
        playerState.setSkillNum(2);
        DebugLog.w("----------- store ---------");
        DebugLog.w(playerState.toString());

        caretaker.setPlayerMemento(playerState.storeMemento());

        DebugLog.w("----------- play ---------");
        DebugLog.w("----------- play ---------");
        DebugLog.w("----------- play ---------");


        playerState.setScore(5000);
        playerState.setDistance(500);
        playerState.setSkillNum(0);
        DebugLog.w("----------- not store ---------");
        DebugLog.w(playerState.toString());


        DebugLog.w("----------- play ---------");
        DebugLog.w("----------- play ---------");
        DebugLog.w("----------- game over ---------");

        playerState.restoreMemento(caretaker.getPlayerMemento());
        DebugLog.w("----------- restore ---------");
        DebugLog.w(playerState.toString());
    }

}
