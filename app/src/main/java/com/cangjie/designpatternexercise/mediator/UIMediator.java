package com.cangjie.designpatternexercise.mediator;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * Created by Administrator on 2016/8/2.
 */
public class UIMediator extends AbstractMediator {
    private Component tv;
    private Component btn;

    public void setTv(Component tv) {
        this.tv = tv;
    }

    public void setBtn(Component btn) {
        this.btn = btn;
    }

    @Override
    public void operator(Component component) {
        if(component.getClass() == Button.class){
            DebugLog.w("--- btn operator ---");
            if(tv == null){
                throw new RuntimeException("tv is null");
            }
            tv.method2();
        }else if(component.getClass() == TextView.class){
            DebugLog.w("--- tv operator ---");
            if(btn == null)
                throw new RuntimeException("btn is null");
            btn.method2();
        }
    }
}
