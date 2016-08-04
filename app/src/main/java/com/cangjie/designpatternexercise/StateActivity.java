package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.cangjie.designpatternexercise.state.CardPlayer;

public class StateActivity extends AppCompatActivity {

    private CardPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        player = new CardPlayer("Tony");
    }
    public void upLevel(View view){
        player.upLevel();
    }
    public void play(View view){
        player.play();
    }
}
