package com.cangjie.designpatternexercise.mediator;

/**
 * Created by Administrator on 2016/8/2.
 */
public abstract class Component {
    private AbstractMediator mediator;

    public Component(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public void method1(){
        mediator.operator(this);
    }
    public abstract void method2();
}
