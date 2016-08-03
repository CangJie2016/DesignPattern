package com.cangjie.designpatternexercise.mediator;

import com.cangjie.designpatternexercise.utils.DebugLog;

/**
 * Created by Administrator on 2016/8/2.
 */
public class ContinueBtn extends Component {
    public ContinueBtn(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void fun(String info) {
        DebugLog.w("This trade is finish,info :"+ info);
    }
}
