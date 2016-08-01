package com.cangjie.designpatternexercise;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cangjie.designpatternexercise.iterator.AbstractIterator;
import com.cangjie.designpatternexercise.iterator.AbstractList;
import com.cangjie.designpatternexercise.iterator.ProductsList;
import com.cangjie.designpatternexercise.utils.DebugLog;

import java.util.ArrayList;
import java.util.List;

public class IteratorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);
        List mData = new ArrayList();
        AbstractList list = new ProductsList(mData);
        list.addObject("Tony");
        list.addObject("Lily");
        list.addObject("Jenny");
        list.addObject("Wise");

        AbstractIterator iterator = list.iterator();
        DebugLog.w("=============正向遍历=============");
        while(true){
            if(iterator.isLast())
                break;
            DebugLog.w("data:"+iterator.getNextItem());
            iterator.next();
        }

        DebugLog.w("=============反向遍历=============");
        while(true){
            if(iterator.isFirst())
                break;
            DebugLog.w("data:"+iterator.getPreviousItem());
            iterator.previous();
        }

        DebugLog.w(" 遍历完成 !!");
    }
}
