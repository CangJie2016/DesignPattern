package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.flyweight.Media;
import com.cangjie.designpatternexercise.flyweight.MediaFactory;
import com.cangjie.designpatternexercise.flyweight.MediaVideo;
import com.cangjie.designpatternexercise.flyweight.PositionAndSize;

public class FlyWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fly_weight);
//        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
//        IgoChessman igo1,igo2,igo3,igo4,igo5;
//        igo1 = factory.getIgoChessman("black");
//        igo2 = factory.getIgoChessman("black");
//        igo3 = factory.getIgoChessman("white");
//        igo4 = factory.getIgoChessman("white");
//        igo5 = factory.getIgoChessman("white");
//
//        DebugLog.w("igo1 == igo2"+ (igo1== igo2));
//        DebugLog.w("igo2 == igo3"+ (igo3== igo2));
//        DebugLog.w("igo4 == igo3"+ (igo3== igo4));
//
//        igo1.display(new Coordinates(1,3));
//        igo2.display(new Coordinates(2,3));
//        igo3.display(new Coordinates(1,4));
//        igo4.display(new Coordinates(1,1));
//        igo5.display(new Coordinates(1,2));
        MediaFactory factory = MediaFactory.getInstance();
        Media m1,m2,m3,m4;
        m1 = factory.getMedia("earth");
        m1.display(new PositionAndSize("7" , "8232kb"));
        m2 = factory.getMedia("Uptown Funk");
        m2.display(new PositionAndSize("32" , "822323232kb"));
        m3 = factory.getMedia("Tom");
        m3.display(new PositionAndSize("100" , "1118232kb"));
        factory.setMedia("new",new MediaVideo("new world"));
        m4 = factory.getMedia("new");
        m4.display(new PositionAndSize("0" , "0kb"));
    }
}
