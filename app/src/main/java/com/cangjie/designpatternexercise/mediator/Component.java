package com.cangjie.designpatternexercise.mediator;

/**
 * Created by Administrator on 2016/8/2.
 */
public abstract class Component {
    private AbstractMediator mediator;

    public Component(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public void operator(){
        operator(null);
    }
    public void operator(String info){
        mediator.operator(this,info);
    }
    public abstract void fun(String info);
}
