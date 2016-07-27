package com.cangjie.designpatternexercise;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cangjie.designpatternexercise.flyweight.Coordinates;
import com.cangjie.designpatternexercise.flyweight.IgoChessman;
import com.cangjie.designpatternexercise.flyweight.IgoChessmanFactory;
import com.cangjie.designpatternexercise.utils.DebugLog;

public class FlyWeightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fly_weight);
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        IgoChessman igo1,igo2,igo3,igo4,igo5;
        igo1 = factory.getIgoChessman("black");
        igo2 = factory.getIgoChessman("black");
        igo3 = factory.getIgoChessman("white");
        igo4 = factory.getIgoChessman("white");
        igo5 = factory.getIgoChessman("white");

        DebugLog.w("igo1 == igo2"+ (igo1== igo2));
        DebugLog.w("igo2 == igo3"+ (igo3== igo2));
        DebugLog.w("igo4 == igo3"+ (igo3== igo4));

        igo1.display(new Coordinates(1,3));
        igo2.display(new Coordinates(2,3));
        igo3.display(new Coordinates(1,4));
        igo4.display(new Coordinates(1,1));
        igo5.display(new Coordinates(1,2));
    }
}
