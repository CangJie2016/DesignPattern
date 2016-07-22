package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.prototype.OfficialDocument;
import com.cangjie.designpatternexercise.prototype.PrototypeManager;
import com.cangjie.designpatternexercise.utils.DebugLog;

public class PrototypeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prototype);
        OfficialDocument doc1, doc2, doc3, doc4, doc5, doc6 = null;
        PrototypeManager pm = PrototypeManager.getInstance();
        doc1 = pm.obtainDocument("far");
        doc1.display();
        doc2 = pm.obtainDocument("far");
        doc2.display();
        DebugLog.w((doc1 == doc2) +"");

        doc3 = pm.obtainDocument("srs");
        doc3.display();
        doc4 = pm.obtainDocument("srs");
        doc4.display();
        DebugLog.w((doc3 == doc4) +"");

        doc5 = pm.obtainDocument("ppr");
        doc5.display();
        doc6 = pm.obtainDocument("ppr");
        doc6.display();
        DebugLog.w((doc5 == doc6) +"");
    }
}
