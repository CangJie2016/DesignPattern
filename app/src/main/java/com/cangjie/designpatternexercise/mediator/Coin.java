package com.cangjie.designpatternexercise.mediator;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * Created by Administrator on 2016/8/2.
 */
public class Coin extends Component {
    public Coin(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void fun(String info) {
        DebugLog.w("投币口：请为站点"+info +"进行支付");
    }
}
