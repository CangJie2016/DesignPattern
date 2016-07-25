package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.builder.MoviePlayerBuilder;
import com.cangjie.designpatternexercise.builder.Player;
import com.cangjie.designpatternexercise.builder.PlayerBuilder;
import com.cangjie.designpatternexercise.utils.DebugLog;

public class BuilderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
//        Actor construst = null;
//        ActorBuilder actorBuilder = (ActorBuilder) XMLUtil.obtainBuilder(this);
//        construst = actorBuilder.construct();
//        DebugLog.w(construst.toString());
        PlayerBuilder builder = new MoviePlayerBuilder();
        Player player = builder.build();
        DebugLog.w(player.toString());
    }
}
