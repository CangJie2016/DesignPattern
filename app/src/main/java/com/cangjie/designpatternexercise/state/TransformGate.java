package com.cangjie.designpatternexercise.state;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * author：CangJie on 2016/8/4 14:56
 * email：cangjie2016@gmail.com
 */
public class TransformGate {
    private String name;
    private State state,open,opening,stayOpen,closed,closing;

    public TransformGate(String name) {
        this.name = name;
        open = new Open();
        opening = new Opening();
        stayOpen = new StayOpen();
        closed = new Closed();
        closing = new Closing();
        this.state = closed;
        DebugLog.w("初始化完成,当前状态");
        state.display();
    }

    public void click(){
        if(state.getClass() == Open.class){
            state = stayOpen;
        }else if(state.getClass() == StayOpen.class){
            state = closing;
        }else if(state.getClass() == Closing.class){
            state = opening;
        }else if(state.getClass() == Opening.class){
            state = closing;
        }else if(state.getClass() == Closed.class){
            state = opening;
        }
        state.display();
    }
    public void complete(){
        if(state.getClass() == Open.class){
        }else if(state.getClass() == StayOpen.class){
        }else if(state.getClass() == Closing.class){
            state = closed;
        }else if(state.getClass() == Opening.class){
            state = open;
        }else if(state.getClass() == Closed.class){
        }
        state.display();
    }
    public void timeout(){
        if(state.getClass() == Open.class){
            state = closing;
        }
        state.display();
    }
}
